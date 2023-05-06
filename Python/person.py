#! /usr/bin/python3

"""
create a class person:
	def __init__
	name 
	email
	card-number
	def validate
"""
import re


class Person:
	def __init__(self, name, email, card_number):
		self.name = name
		self.email = email
		self.card_number = card_number

	def validate(self):
		name = re.search("^[A-Z][a-z]+\s[A-Z][a-z]+", self.name)
		email = re.search("[A-Za-z]+@[a-z]+\.[a-z]+", self.email)
		card_number = re.search("[A-Z]{2}\-\d{3}\-\d{5}", self.card_number)
		if name and email and card_number:
			return True
		else:
			return False


p1 = Person("Aaa Baa", "Aaa@bbb.ccc", "AA-111-33333")
print(p1.validate())

p2 = Person("Aaa", "Aaa@bbb.ccc", "AA-111-33333")
print(p2.validate())

p3 = Person("Aaa Baa", "Aaa@bbb.ccc", "AA-111-333")
print(p3.validate())







