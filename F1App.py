import pymongo


client = pymongo.MongoClient("mongodb+srv://<username>:<password>@clusterf1-gof0m.gcp.mongodb.net/test?retryWrites=true&w=majority")
db = client.test

for x in client.f1.drivers.find():  
  print(x)  
