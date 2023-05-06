#! /usr/bin/python3

class Animal:
	def __init__(self, name, age):
		self.name = name
		self.age = age

class Dog(Animal):
	def __init__(self, name, age, bread):
		super().__init__(name, age)
		self.bread = bread

my_dog = Dog("Bob", 2, "bulldog")
print(my_dog.__dict__)		


