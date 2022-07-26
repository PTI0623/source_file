import pandas as pd
from sklearn.linear_model import LinearRegression
import numpy as np
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestRegressor
import matplotlib.pyplot as plt

train_df = pd.read_excel('fs.xlsx',sheet_name='train')
test_df = pd.read_excel('fs.xlsx',sheet_name='test')

print(train_df.head())
print(test_df.head())

train_input = train_df[['Father']].to_numpy()
print(train_input[:5])
train_target = train_df['Son'].to_numpy()

test_input = test_df[['Father']].to_numpy()
test_target = test_df['Son'].to_numpy()

print(test_target[:5])

lr = LinearRegression();
lr.fit(train_input,train_target)

훈련점수 = lr.score(train_input,train_target)
테스트점수 = lr.score(test_input,test_target)

print(훈련점수)
print(테스트점수)

pred = lr.predict([[160]])
print('예측키 =',pred)

prediction = lr.predict(test_input[:30])

plt.scatter(train_input,train_target)
plt.plot(train_input[:30],prediction,c='#ff0000')
plt.plot([[140],[200]],lr.predict([[140],[200]]),c='#00ff00')
plt.xlabel('father')
plt.ylabel('son')
plt.show()