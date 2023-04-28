#! /usr/bin/python3

import sqlite3

class DB_driver:
	def __init__(self, db_name):
		self.db_name = db.name
		self.connection = sqlite.connect(self.db_name)
		print("Connection opened successfully.")
	def drop_table(self, table):
		self.connection.execute("DROP TABLE IF EXISTS {}".format(table))
	def create_table(self, table):
		self.drop_table(table)
		self.connection.execute(
		"CREATE TABLE {} \
		(ID INT PRIMARY KEY NOT NULL, \
		NAME TEXT NOT NULL, \
		AGE INT NOT NULL, \
		ADDRESS CHAR(50), \
		SALARY REAL);".format(table)
		)
		print("Table {} created successfully.".format(table))	

	def insert_values(self, values):
		for value in values:
			self.connection.execute(value)
		self.connect.commit()
		print("{} records created successfully".format(len(values)))

	def get_all_records(self, ):
		pass


db = DB_Driver("MYDB")
#....








