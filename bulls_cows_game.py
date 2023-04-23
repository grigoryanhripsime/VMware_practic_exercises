#!/usr/bin/python3

'''
we have a number computer have also a number
number need to have 4 digits
    1st digit can't be 0
    digits can't be same
if it's my turn i say a number 
    example: 1234 (number is 1523)
    computer will say 1 bull and 2 cows
Now it's computer's turn....
Game will be running until one of us says 4 bulls and 0 cows
'''
import random

#computer gives a number to guess

#checking for valid guessing number
while True:
    num = random.randint(1234, 9876)
    num_str = str(num)
    if not (num_str[0] == num_str[1] or num_str[0] == num_str[2] or num_str[0] == num_str[3] or num_str[1] == num_str[2] or num_str[1] == num_str[3] or num_str[2] == num_str[3]):
        break
hidden_num = num_str


def your_turn():
    #checking for valid input
    while True:
        in_num = input("Your turn: ")
        if not (in_num[0] == "0" or in_num[0] == in_num[1] or in_num[0] == in_num[2] or in_num[0] == in_num[3] or in_num[1] == in_num[2] or in_num[1] == in_num[3] or in_num[2] == in_num[3]):
            break
        print("Invalid input.")

    bulls = 0
    cows = 0
#Checking for correct digits and positions
    for digit in in_num:
        if digit in hidden_num:
            if in_num.index(digit) == hidden_num.index(digit):
                bulls += 1
            else:
                cows += 1
    print(bulls, "bulls and ", cows, "cows")
    if bulls == 4:
        print("You won!!!")
        return True
    else:
        return False

#Computer's play
inputed_nums = []
digits = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
def my_turn(bulls, cows):
    if bulls == 4:
        print("I won!!!")
        return True
#if we have all digits but in wrong order
    if bulls + cows == 4:
        arr = [num_str[0], num_str[1], num_str[2], num_str[3]]
        num_str = ""
        while len(num_str) < 4:
            digit = random.randint(0, 3)
            if not str(digit) in num_str:
                num_str += arr[digit]
            if num_str in inputed_nums:
                num_str = ""
        inputed_nums.append(num_str)
#if there are some matches, but not at all
    elif bulls + cows < 4 and bulls + cows > 0:
        num_str = ""
        while len(num_str) < 4:
            digit = random.randint(0, 9)
            if digit == 0 and len(num_str) == 0:
                pass
            if not str(digit) in num_str and (digits[int(digit)] <= max(digits)):
                num_str += str(digit)
            if num_str in inputed_nums:
                num_str = ""
        for i in num_str:
            digits[int(i)] += (bulls + cows)
        inputed_nums.append(num_str)
#start of the game
    else:
        num_str = ""
        while len(num_str) < 4:
            digit = random.randint(0, 9)
            if digit == 0 and len(num_str) == 0:
                pass
            if not str(digit) in num_str:
                num_str += str(digit)
            if num_str in inputed_nums:
                num_str = ""
        inputed_nums.append(num_str)
    print("My turn: ", num_str)
    return False


def main():
    print(hidden_num)
    print("Bulls and cows game")
    my_turn(0, 0)
    while True:
        bulls = int(input("Bulls: "))
        cows = int(input("Cows: "))
        aaa = your_turn()
        bbb = my_turn(bulls, cows)
        if aaa or bbb:
            print("Game over")
            break


if __name__ == "__main__":
    main()


















