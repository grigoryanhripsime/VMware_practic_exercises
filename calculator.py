#! /usr/bin/python3

'''
Exception types that we can use to catch them and get logs:
    deviding to zero
    getting not a numeric value as a number
    getting operation's name that doesn't exist / for this we need to raise an exception
'''

import logging

class Calculator:
	def add(self, n1, n2):
		return n1 + n2

	def sub(self, n1, n2):
		return n1 - n2

	def mult(self, n1, n2):
		return n1 * n2

	def div(self, n1, n2):
		return n1 / n2

logging.basicConfig(filename = "logging_file.log", filemode = "w+", format = '%(asctime)s %(levelname)s:%(message)s', level = 10)


try:
    n1 = int(input("Enter first number: "))
    logging.info("n1 was successfully added")
except ValueError:
    logging.error("Trouble with inputting n1")
    exit(1)

try:
    n2 = int(input("Enter second number: "))
    logging.info("n2 was successfully added")
except ValueError:
    logging.error("Trouble with inputting n2")
    exit(1)

operation = input("Enter operation type(add/sub/mult/div): ")

calculator = Calculator()

if operation == "add":
    print(calculator.add(n1, n2))
    logging.info("Successfully added %s to %s", n1, n2)
elif operation == "sub":
    print(calculator.sub(n1, n2))
    logging.info("Successfully subtracted %s to %s", n1, n2)
elif operation == "mult":
    print(calculator.mult(n1, n2))
    logging.info("Successfully multiplied %s to %s", n1, n2)
elif operation == "div":
    try:
        print(calculator.div(n1, n2))
        logging.info("Successfully divided %s by %s", n1, n2)
    except ZeroDivisionError:
        logging.error("Division by zero")
        exit(1)
else:
    logging.error("Wrong inputed operation name")

logging.info("Programm was successfully ended.")
