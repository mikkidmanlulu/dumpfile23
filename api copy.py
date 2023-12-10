from urllib import response
import requests

response = requests.get("http://fakestoreapi.com/products")

print(response)