#!/usr/bin/python3

import requests
from bs4 import BeautifulSoup
import csv
import logging


#Getting URL 
def r_get(url):
	while True:
		r_url = url
		r = requests.get(r_url)
		if r.status_code == 200:
			logger.info("Success!!!")
			break
		else: logger.error("ERROR!!!!")
	return r

#Parsing HTML
def something(r):
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
	logger.info("Information has been parsed")
	return jobs

def something2(jobs):
	with open('jobs.csv', 'w') as file:
		writer = csv.writer(file)
		writer.writerow(list(jobs[0].keys()))
		for line in jobs:
			writer.writerow([line['title'], line['company'], line['date'], line['location']])
		logger.info("File was open and data was inputed")

def main():
	url = "https://www.staff.am/en/jobs"
	r = r_get(url)
	jobs = something(r)
	logger.warning('This will get logged to a file')



if __name__ == "__main__":
	logging.basicConfig(filename='app.log', filemode='w+', format='%(name)s - %(levelname)s - %(message)s')
	logger = logging.getLogger()
	main()































