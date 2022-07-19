import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_absolute_error

data = pd.read_csv('chap3.csv')
length = data['length'].to_numpy()
weight = data['weight'].to_numpy()

train_input,test_input,train_target,test_target=train_test_split(length,weight,random_state=42)
train_input=train_input.reshape(-1,1)
test_input=test_input.reshape(-1,1)

lr=LinearRegression()
lr.fit(train_input,train_target)
print(lr.predict([[50]]))
print(lr.coef_,lr.intercept_)

plt.scatter(train_input,train_target)
plt.plot([15,50], [15*lr.coef_+lr.intercept_,50*lr.coef_+lr.intercept_])
plt.scatter(50,1241.8,marker='^')
plt.xlabel('length')
plt.ylabel('weight')
plt.show()

print("훈련점수, 테스트점수")
print(lr.score(train_input,train_target))
print(lr.score(test_input,test_target))

train_poly = np.column_stack((train_input**2,train_input))
print(train_input[:5])

test_poly = np.column_stack((test_input**2,test_input))
lr.fit(train_poly,train_target)
print(lr.predict([[50**2,50]]))

print("훈련점수, 테스트점수")
print(lr.score(train_poly,train_target))
print(lr.score(test_poly,test_target))

x1 = np.arange(15,50)
x1 = np.column_stack((x1**2,x1))

prediction = lr.predict(x1)
print(x1[:5],prediction[:5])

가중치= lr.coef_

bias=lr.intercept_
print(f'weight = {가중치} bias = {bias}')

plt.scatter(train_input,train_target)
plt.plot(np.arange(15,50),prediction)
plt.show()