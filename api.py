import requests
response = requests.get("http://fakestoreapi.com/products")
print(response.json())