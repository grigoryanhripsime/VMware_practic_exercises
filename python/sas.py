"""

"""


import requests

rate_url = 'http://rate.am/'

r = requests.get(rate_url)

print(r.status_code)
print()
print(r.content)
