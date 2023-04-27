#! /usr/bin/python3

import re

def show_results(match_object):
	if match_object:
		print("Match: " + match_object.group())
txt = "I live in Yerevan, the capital of Armenia; The population of Armenia is 2.791 mln. About 1 mln people live in Yerevan."

print("1")
result = re.search("Yerevan", txt)
show_results(result)

print("2")
result = re.search("^I live.*;", txt)
show_results(result)

print("3")
result = re.search("^.*Armenia", txt)
show_results(result)

print("4")
result = re.search("T.*$", txt)
show_results(result)

print("5")
result = re.search("^(I|We|They).*", txt)
show_results(result)

print("6")
result = re.search("mln", txt)
show_results(result)

print("7")
result = re.search("The population.*people", txt)
show_results(result)

print("8")
txt = "let's plaaay tennis"
result = re.search("\s.*a{1, 3}y\s", txt)
show_results(result)

txt = "I like to play different games. I like to play tennis. I don't like to play volleyball"
result = re.findall("play\s\w+", txt)
print(f"Matches found: {len(result)}")

result = re.findall("a\w{,1}", txt)
print(result)











