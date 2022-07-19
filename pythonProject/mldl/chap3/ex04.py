import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.neighbors import KNeighborsRegressor
from sklearn.model_selection import train_test_split

data = pd.read_csv('chap3.csv')
length = data['length'].to_numpy()
weight = data['weight'].to_numpy()

train_input,test_input,train_target,test_target=train_test_split(length,weight,random_state=42)
#x값에 들어가는 numpy데이터들은 꼭 reshape(-1,1) 해줘야함!
train_input=train_input.reshape(-1,1)
test_input=test_input.reshape(-1,1)

knr =KNeighborsRegressor(n_neighbors=3)
knr.fit(train_input,train_target)

prevalue=knr.predict([[50]])
print(prevalue)
prevalue=knr.predict([[100]])
print(prevalue)

distance, indexes = knr.kneighbors([[50]])
print(indexes)

train_values = train_input[indexes],train_target[indexes]
print(train_values)
plt.scatter(train_input,train_target)
plt.scatter(train_input[indexes],train_target[indexes],marker='*')
plt.scatter(50,1033,marker="^")
plt.scatter(100,1033,marker="^")
plt.show()