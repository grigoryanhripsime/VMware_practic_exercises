#!/usr/bin/python3

class Student:
	number_of_students = 0

	def __init__(self, first, last):
		self.first = first
		self.last = last
		self.initials = "{}{}".format(first[0], last[0])
		self.email = "{}{}@vmware.com".format(self.first, self.last)
		Student.number_of_students += 1
		
	def get_firstname(self):
		return self.first
	
	def set_firstname(self, new_name):
		self.first = new_name

	def __str__(self):
		return "{}{}".format(self.first, self.last)

	def __len__(self):
		return len(self.first) + len(self.last)

	def __eq__(self, other):
		return self.first == other.first and self.last == other.last



#print(Student.__dict__)
s = Student("Sam", "Israelyan")
s2 = Student("Marine", "Harutyunyan")

#print(Student.number_of_students)
#print(s)
#print(s.__dict__)

#s.set_firstname("Karen")
#print(s.get_firstname())

print(s.__str__())
print(s.__len__())
if s == s2:
	print("Same")
else:
	print("Different")

















