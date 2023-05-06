#!/usr/bin/python3
import requests
from bs4 import BeautifulSoup

stuff_url = "https://www.staff.am/en/jobs"

r = requests.get(stuff_url)

soup = BeautifulSoup(r.content, "html.parser")
job_div = soup.find_all("div", class_ = "right_radius_change hb_list_item clearfix")

job_name = []
company_name = []
date = []
locations = []

for i in job_div:
	job_name.append(i.find("p", class_ = "font_bold"))
	company_name.append(i.find("p", class_ = "job_list_company_title"))
	date.append(i.find("span", class_ = "formatted_date"))
	locations.append(i.find("p", class_ = "job_location"))


jobs = []
for line in range(len(job_name)):
	job = {
		"title" : job_name[line].text.strip(),
		"company" : company_name[line].text.strip(),
		"date" : date[line].text.strip(),
		"location" : locations[line].text.strip()
	}
	jobs.append(job)
for job in jobs:
	print("Job title: ", job["title"])
	print("Company: ", job["company"])
	print("Date: ", job["date"])
	print("Location: ", job["location"])
	print("-" * 20)










#jobs = []
#jobs.append(job_names)
#jobs.append(company_names)
#jobs.append(dates)
#jobs.append(locations)

#for column in range(len(job_names)):
#	print("Job name: " + jobs[0][column].text)
#	print("Company name: " + jobs[1][column].text)
#	print("Date: " + jobs[2][column].text)
#	print("Lication: " + jobs[3][column].text)
#	print("-"*50)













