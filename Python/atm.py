#! /usr/bin/python3
"""
1. get card
2. ask for password
3. display options to select what you want to do
    if you select checking balace, shows how much money do you have
    if ypu want get out money, it checks if you have that amount, then subtract that from yout balance
4. if all succedd then atm gives you reseipt


classes:
    ATM
    screen - shows information
    keyboard - get input
    card_reader - get info from card
    cash_giver - subtruct balanceof the card
    receipt_printer - prints info about transaction

    card - have number, password, balance
"""
import datetime

class Screen:
    #function to ask for password
    def ask_for_password(self):
        print("Enter your password: ", end = "")

    #function to ask type of transaction
    def transaction_type(self):
        print("Enter 1 to check your card's balance or enter 2 to get out money: ", end = "")

    #function to show balance
    def show_balance(self, balance):
        print("Balance: ", balance)

    #function to ask for amount of money
    def get_money(self):
        print("How much money do you want to get: ", end = "")

    #function to show transaction's status
    def status(self, status):
        if status:
            print("Succeed.")
        else:
            print("Something went wrong, please try again later.")

class Keyboard:
    #function to get input
    def get_input(self):
        inpt = int(input())
        return inpt

class Card_reader:
    #function to get card's number, password, balance
    def get_card(self, card):
        self.card_number = card.card_number
        self.password = card.password
        self.balance = card.balance

class Cash_giver:
    #function to - amount that inputed customer from card balance
    def sub_amount(self, balance, amount):
        balance = balance - amount
        return balance

class Receipt_printer:
    #function to give/print info about transaction
    def get_receipt(card_number, balance, amount, date, check):
        print("Receipt")
        print("Card number: ", card_number)
        print("Card balance: ", balance)
        if check == 2:
            print("Subtracted amount: ", amount)
        print("Date: ", date)


class ATM:
    number_of_atm = 0 #id
    def __init__(self, screen, keyboard, card_reader, cash_giver, receipt_printer):
        self.screen = screen
        self.keyboard = keyboard
        self.card_reader = card_reader
        self.cash_giver = cash_giver
        self.receipt_printer = receipt_printer
        ATM.number_of_atm += 1
    
    #function that asks for password
    def asking_password(self):
        self.screen.ask_for_password()
        passwrd = self.keyboard.get_input()
        if self.card_reader.password == passwrd:
            self.screen.status(True)
            return True
        else:
            self.screen.status(False)
            return False

    #function that asks for transaction's type
    def action_type(self):
        amount = 0
        if self.asking_password():
            self.screen.transaction_type()
            typee = self.keyboard.get_input()
            if typee == 1:
                self.screen.show_balance(self.card_reader.balance)
            elif typee == 2:
                self.screen.get_money()
                amount = self.keyboard.get_input()
                if amount <= self.card_reader.balance:
                    self.card_reader.balance = self.cash_giver.sub_amount(self.card_reader.balance, amount)
                    self.screen.status(True)
                else:
                    self.screen.status(False)
            else:
                self.screen.status(False)
            self.receipt_printer.get_receipt(self.card_reader.card_number, self.card_reader.balance, amount, datetime.datetime.now(), typee)

#making card class
class Card:
    def __init__(self, card_number, password, balance):
        self.card_number = card_number
        self.password = password
        self.balance = balance


def main():
    #making ATM
    atm = ATM(Screen(), Keyboard(), Card_reader(), Cash_giver(), Receipt_printer)
    #making customer
    customer = Card("4012888888881881", 1234, 100000)
    atm.card_reader.get_card(customer)
    atm.action_type()
    print("Done")

if __name__ == "__main__":
    main()



























