#! /usr/bin/python3

file = input("Enter log file path: ")
key = input("Enter key words: ")

with open(file, "r") as f:
    for line in f:
        if key in line:
            print(line)









































