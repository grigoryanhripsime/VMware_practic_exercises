#!/usr/bin/python3

class Vehicle:
	def __init__(self, brand, model, vehicle_type, engine_type, color, vin_code):
		self.brand = brand
		self.model = model
		self.color = color
		self.vhicle_type = vehicle_type
		self.engine_type = engine_type
		self.vin_code = vin_code

v = Vehicle("Honda", "Accord", "Sedan", "Ev", "Black", "123456789012345")
print(v)	
print(v.__dict__)











