import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split

data = pd.read_csv('wine.csv')

print(data.head())
print(data.describe())
print(data.info())

wine_data = data[['alcohol', 'sugar', 'pH']].to_numpy()
wine_class = data['class'].to_numpy()

train_input, test_input, train_target, test_target = train_test_split(wine_data, wine_class, test_size=0.2,
                                                                      random_state=42)
print(train_input.shape)
print(test_input.shape)

from sklearn.preprocessing import StandardScaler

ss = StandardScaler()
ss.fit(train_input)
train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

print(train_scaled[:5])
print(train_target[:5])

from sklearn.linear_model import LogisticRegression

lr = LogisticRegression()
lr.fit(train_scaled, train_target)

훈련점수 = lr.score(train_scaled, train_target)
테스트점수 = lr.score(test_scaled, test_target)

print(훈련점수)
print(테스트점수)

# 직접 데이터 가져와서 예측값 맞는지 비교해보기
mydata = [[10.2, 2.0, 3.57], [11.0, 3.6, 3.39], [8.8, 20.7, 3.0], [9.5, 1.6, 3.3]]
mydata_target = [0, 0, 1, 1]
mydata_scaled = ss.transform(mydata)
예측값 = lr.predict(mydata_scaled)
print(예측값)
print(mydata_target)

x = np.array([i for i in range(30, 50, 2)])
y = np.array(x ** 2 + x * 1.5 + 5)
x= x.reshape(-1,1)

print(x)
print(y)

from sklearn.linear_model import LinearRegression
lr=LinearRegression()
lr.fit(x,y)

print('가중치',lr.coef_)
print('절편',lr.intercept_)

예측값 = lr.predict([[49]])
print(예측값)

from sklearn.tree import DecisionTreeClassifier
dt = DecisionTreeClassifier(min_impurity_decrease=0.0005, random_state=42)
dt.fit(train_scaled,train_target)

print(dt.score(train_scaled,train_target))
print(dt.score(test_scaled,test_target))

# mydata = [[10.2, 2.0, 3.57], [11.0, 3.6, 3.39], [8.8, 20.7, 3.0], [9.5, 1.6, 3.3]]
# mydata_target = [0, 0, 1, 1]
# mydata_scaled = ss.transform(mydata)
# 예측값 = dt.predict(mydata_scaled)
# print(예측값)
# print(mydata_target)

import matplotlib.pyplot as plt
from sklearn.tree import plot_tree
plt.figure(figsize=(20,15))
plot_tree(dt, filled=True, max_depth=2, feature_names=['alcohol','sugar','pH'])
plt.figure(figsize=(20,15))
plot_tree(dt, max_depth=3, filled=True, feature_names=['alcohol', 'sugar', 'pH'])
print(dt.feature_importances_)
plt.show()
