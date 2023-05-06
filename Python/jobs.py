#!/usr/bin/python3

import requests
from bs4 import BeautifulSoup
import csv
import logging

def r_get(url):
    while True:
        r = requests.get(url)
        if r.status_code == 200:
            logging.info("Successfully connected.")
            break
        else:
            logging.error(r.status_code)
    return r

def parsing_html(r):
    soup = BeautifulSoup(r.content, "html.parser")
    job_div = soup.find_all("div", class_ = "right_radius_change hb_list_item clearfix")
    jobs = []
    for i in job_div:
        job = {
                "title" : i.find("p", class_ = "font_bold").text.strip(),
                "company" : i.find("p", class_ = "job_list_company_title").text.strip(),
                "date" : i.find("span", class_ = "formatted_date").text.strip(),
                "location" : i.find("p", class_ = "job_location").text.strip()
                }
        jobs.append(job)
    logging.info("HTML was parsed.")
    return jobs

def filling_file(jobs):
    with open("jobs.csv", "w") as file:
        writer = csv.writer(file)
        writer.writerow(list(jobs[0].keys()))
        for line in jobs:
            writer.writerow([line["title"], line["company"], line["date"], line["location"]])
    logging.info("List of jobs was rewritten in jobs.csv")

def main():
    logging.basicConfig(level = logging.INFO)
    url = "https://staff.am/en/jobs"
    r = r_get(url)
    jobs = parsing_html(r)
    filling_file(jobs)

if __name__ == "__main__":
    main()








































