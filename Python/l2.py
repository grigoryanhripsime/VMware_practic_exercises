#!/usr/bin/python3

#checking if number is even or odd
'''
x = int(input("Please enter an integer: "))
if x == 0:
    print('zero')
elif x % 2 == 0:
    print('even number')
else:
    print('odd number')
'''

#checking if number is even or odd on one line
'''
print("even") if int(input("Please enter an integer: ")) % 2 == 0 else print("odd")
'''


'''
x="number"
while x.isdigit() == False:
	x=input("Enter an integer: ")
x = int(x)
if(x >10):
	print("x is bigger than 10")

'''


'''
while True:
	x = input("Enter a number: ")
	if (x.isdigit()):
		print("even") if int(x) % 2 == 0 else print("odd")
		break
'''

'''
import math

x=int(input("Enter a number: "))
for digit in range(2, int(math.sqrt(x))):
	if (x % digit == 0):
		print("Number isn't prime")
		quit()
print("Number is prime")
'''

'''
x = ['hello']
def full(x):
	x = x.append("world")
print(x)
full(x)
print(x)
'''

'''
text = input("Enter text for encryption: ")
text = text.upper()
while True:
	key = input("Enter key value for encryption: ")
	if (key.isdigit()):
		break
key = int(key)
def encrypt(text, key):
	cipher = ""
	for i in text:
		if (ord(i) + key > 90):
			aaa = 65 + ord(i) - 90	
		else:
			aaa = ord(i)
		cipher += chr(aaa + key)
	return cipher

def decrypt(text, key):
	decipher = ""
	for i in text:
		if (ord(i) - key < 26):
			aaa = ord(i) + 25
		else:
			aaa = ord(i)
		decipher += chr(aaa - key)
	return decipher	

cipher = encrypt(text, key)
print(cipher)
print(decrypt(cipher, key))
'''

#Bubbile sort

list = [1, 7, 4, 0, 2, 8]
print(list)
k=0
print(len(list))
while True:
	for i in range(len(list)-1):
		if (list[i] > list[i+1]):
			list[i], list[i+1] = list[i+1], list[i]
	k+=1
	if k == len(list):
		break
print(list)









































































































