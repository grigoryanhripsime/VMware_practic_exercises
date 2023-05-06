#! /usr/bin/python3

class Animal:
	def move(self):
		print("Moving")

class Dog(Animal):
	def move(self):
		print("Walking")

class Fish(Animal):
	def move(self):
		print("Swimming")

class Bird(Animal):
	def move(self):
		print("Flying")


'''
print("Dog")
dog = Dog()
dog.move()

print("Fish")
fish = Fish()
fish.move()

print("Bird")
bird = Bird()
bird.move()
'''

def g(animal):
	animal.move()

g(Bird())
g(Fish())
g(Dog())
























