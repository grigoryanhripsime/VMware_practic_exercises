#! /usr/bin/python3

class Calculator:
	def add(self, n1, n2):
		return n1 + n2

	def sub(self, n1, n2):
		return n1 - n2

	def mult(self, n1, n2):
		return n1 * n2

	def div(self, n1, n2):
		return n1 / n2



n1 = int(input("Enter first number: "))
n2 = int(input("Enter secont number: "))
operation = input("Enter operation type(add/sub/mult/div): ")

calculator = Calculator()
match operation:
	case "add":
		print(calculator.add(n1, n2))
	case "sub":
		print(calculator.sub(n1, n2))
	case "mult":
		print(calculator.mult(n1, n2))
	case "div":
		print(calculator.div(n1, n2))
	
