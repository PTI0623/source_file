import pandas as pd
import numpy as np
from sklearn.neighbors import KNeighborsClassifier as KN
import matplotlib.pyplot as plt

data = pd.read_excel('data.xlsx')

print(data)

length=data['length'].to_numpy()
weight=data['weight'].to_numpy()
target=data['target'].to_numpy()

print(length[:5])
print(weight[:5])
print(target[:5])

plt.scatter(length[:35],weight[:35])
plt.scatter(length[35:],weight[35:])
#plt.show()

data = [[l,w] for l,w in zip(length,weight)]

kn=KN()
kn.fit(data,target)

prevalue = kn.predict([[50,500],[10,12]])
print(prevalue)
