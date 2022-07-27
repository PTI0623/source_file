import numpy as np
import pandas as pd
from sklearn import datasets
from sklearn.linear_model import LinearRegression
from sklearn import metrics
from sklearn.linear_model import Ridge,Lasso
from sklearn.preprocessing import PolynomialFeatures
from sklearn.model_selection import train_test_split

dataset= datasets.fetch_california_housing()
x = dataset.data
y = dataset.target

print(x.shape)
print(y.shape)

dataframe =pd.DataFrame(dataset.data, columns=dataset.feature_names)
print(dataframe.head())
print(dataframe.tail())

train_input,test_input,train_target,test_target=train_test_split(x,y,random_state=42)
lr = LinearRegression()
lr.fit(train_input,train_target)
훈련점수 = lr.score(train_input,train_target)
테스트점수 = lr.score(test_input,test_target)
print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')

# print(train_input[:2])
print('실제값=',train_target[:2])
prevalue = lr.predict(np.round(train_input[:2]))
print(f'예측값={prevalue}')

poly = PolynomialFeatures(degree=4)
poly.fit(train_input)

train_poly = poly.transform(train_input)
test_poly = poly.transform(test_input)

print(train_poly.shape)
print(test_poly.shape)

lr.fit(train_poly,train_target)
훈련점수 = lr.score(train_poly,train_target)
테스트점수 = lr.score(test_poly,test_target)
print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')

print('--------------LinearRegressor----------------')
prevalue = lr.predict(train_poly[:2])
print(f'예측값={prevalue}')
prevalue = lr.predict(np.round(train_poly[:2]))
print(f'예측값={prevalue}')

print('--------------Ridge----------------')
ridge =Ridge()
ridge.fit(train_poly,train_target)
prevalue = ridge.predict(train_poly[:2])
print(f'예측값={prevalue}')
prevalue = ridge.predict(np.round(train_poly[:2]))
print(f'예측값={prevalue}')
훈련점수 = ridge.score(train_poly,train_target)
테스트점수 = ridge.score(test_poly,test_target)
print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')

print('--------------Lasso----------------')
lasso =Lasso()
lasso.fit(train_poly,train_target)
prevalue = lasso.predict(train_poly[:2])
print(f'예측값={prevalue}')
prevalue = lasso.predict(np.round(train_poly[:2]))
print(f'예측값={prevalue}')
훈련점수 = lasso.score(train_poly,train_target)
테스트점수 = lasso.score(test_poly,test_target)
print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')
