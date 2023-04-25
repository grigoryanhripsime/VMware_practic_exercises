#! /usr/bin/python3

class Screen:
	def check_user(self, card_reader):
		print("Enter your password: ")
		password = keyboard.get_input()
		if password == card.password:
			print("Successful checked")
			return True
		else
			print("Error!")
			return False
	def display():
		if check_user:
			print("1 for checking balance\n2 for taking cash")
			inputt = keyboard.get_input()
			if inputt == 1:
				check_balance()
			elif inputt == 2:
				get_cash()
			else:
				print("Invalid input")
	def check_balance():
		print
class Keyboard:
	def get_input():
		return int(input())	

class Card_reader:
	def __init__(self, card):
		self.card = card

class Cash_giver:
	pass

class Receipt_printer:
	pass
	

class ATM:
	def __init__(self, bank_name, address, screen, keyboard, card_reader, cash_giver, receipt_printer):
		self.bank_name = bank_name
		self.address = address
		self.screen = screen
		self.keyboard = keyboard
		self.card_reader = card_reader
		self.cash_giver = cash_giver
		self.receipt_printer = receipt_printer
		
class Card:
	def __init__(self, card_number, password, balance):
		self.card_number = card_number
		self.password = password
		self.balance = balance















				
