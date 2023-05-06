#! /usr/bin/python3

import sqlite3

class DB_Driver:
	def __init__(self, db_name):
		self.db_name = db_name
		self.connection = sqlite3.connect(self.db_name)
		print("Connection opened successfully.")

	def drop_table(self, table):
		self.connection.execute("DROP TABLE IF EXISTS {}".format(table))

	def create_table(self, table):
		self.drop_table(table)
		self.connection.execute(
		"CREATE TABLE {} \
         (ID INT PRIMARY KEY     NOT NULL, \
         NAME           TEXT    NOT NULL, \
         AGE            INT     NOT NULL, \
         ADDRESS        CHAR(50), \
         SALARY         REAL);".format(table))

		print("Table {} created successfully".format(table))


    def insert_test_values(self, values):
        for value in values:
            print(value)
            self.connection.execute(value)

		self.connection.commit()
		print("{} records created successfully".format(len(values)));


	def get_all_records_from(self, table):
		cursor = self.connection.execute("SELECT id, name, address, salary from {}".format(table))
		for row in cursor:
			print("ID = {} NAME = {} ADDRESS = {} SALARY = {}".format(row[0], row[1], row[2], row[3]))

	def close_connection(self):
		self.connection.close()

class User:
    def __init__(self, id, name, age, address, salary):
        self.id = id
        self.name = name
        self.age = age
        self.address = address
        self.salary = salary
    def user_db(self):
        insert = "INSERT INTO MY_TABLE (ID,NAME,AGE,ADDRESS,SALARY) VALUES ({},'{}',{},'{}',{})".format(self.id, self.name, self.age, self.address, self.salary)
        print(insert)
        db.insert_test_values(insert)
        
class Controller:
    def input(self):
        id = int(input("ID = "))
        name = input("Name = ")
        age = int(input("Age = "))
        address = input("Address = ")
        salary = float(input("Salary = "))
        user = User(id, name, age, address, salary)
        user.user_db()

# --------------------------------------------

'''
test_values = [
	"INSERT INTO MY_TABLE (ID,NAME,AGE,ADDRESS,SALARY) VALUES (1, 'Paul', 32, 'California', 20000.00 )",
	"INSERT INTO MY_TABLE (ID,NAME,AGE,ADDRESS,SALARY) VALUES (2, 'Allen', 25, 'Texas', 15000.00 )",
	"INSERT INTO MY_TABLE (ID,NAME,AGE,ADDRESS,SALARY) VALUES (3, 'Teddy', 23, 'Norway', 20000.00 )",
	"INSERT INTO MY_TABLE (ID,NAME,AGE,ADDRESS,SALARY) VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 )"
]
'''

db = DB_Driver("MYDB")
db.create_table("MY_TABLE")
controller = Controller()
controller.input()
db.get_all_records_from("MY_TABLE")
db.close_connection()

# sqlite3 commands
# sqlite3 <name of the DB>
# .tables
# select * from <table>







