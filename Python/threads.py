#! /usr/bin/python3

from time import sleep
from threading import Thread

def task():
	sleep(1)
	print("This is from another thread.")
thread = Thread(target=task)
thread.start()
print("Waiting for the thread...")
#thread.join()
print("This will show useage of .join()")


















