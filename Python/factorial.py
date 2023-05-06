#! /usr/bin/python3

import time
import concurrent.futures

def f(n):
	fact = 1
	for i in range(1, n+1):
		fact *= i
	return "Factorial of {} is {}".format(n, fact)
	file = open("results/fact_{}.txt".format(n), "w")
	file.write("Factorial of {} is {}".format(n, fact))
	file.close()

'''
n = int(input("Enter number: "))
thread = Thread(target=f, args=(n,))
thread.start()
print("This is another thread.")
'''

numbers= [4, 5, 8, 12, 15, 17, 20, 25, 32]

start_time = time.process_time()
with concurrent.futures.ThreadPoolExecutor() as executor:
	futures = []
	for i in numbers:
		futures.append(executor.submit(f, n=i))
	for future in concurrent.futures.as_completed(futures):
		print(future.result(), "concurrent")
end_time = time.process_time()
concurrent_elapsed_time = end_time - start_time
print("time = ", concurrent_elapsed_time)


start_time = time.process_time()
for n in numbers:
	print(f(n), "sequential")
end_time = time.process_time()
sequential_elapsed_time = end_time - start_time
print("time = ", sequential_elapsed_time)









