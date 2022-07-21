import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
import numpy as np
from sklearn.linear_model import SGDClassifier
from sklearn.neighbors import KNeighborsClassifier
import matplotlib.pyplot as plt

fish=pd.read_csv('fish_data.csv')
fish_input = fish[['Weight','Length','Diagonal','Height','Width']].to_numpy()
fish_target = fish['Species'].to_numpy()


train_input, test_input, train_target, test_target = train_test_split(
    fish_input, fish_target, random_state=42)

ss = StandardScaler()
ss.fit(train_input)
train_scaled=ss.transform(train_input)
test_scaled=ss.transform(test_input)

print(train_scaled[:5])
print(train_target[:5])

sgd = SGDClassifier(loss='log',max_iter=100,random_state=42)
sgd.fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

sgd.partial_fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

indexes = (train_target=='Whitefish')
print(indexes)
# indexes = (test_target=='Whitefish')
# print(indexes)
예측값 = sgd.predict(train_scaled[indexes])
print(예측값)

sc = SGDClassifier(loss='log',max_iter=100,random_state=42)

train_score =[]
test_score = []
classes = np.unique(train_target)
print(classes)

for _ in range(300):
    sc.partial_fit(train_scaled,train_target,classes=classes)
    train_score.append(sc.score(train_scaled,train_target))
    test_score.append(sc.score(test_scaled,test_target))

print(train_scaled[:5])
print(test_scaled[:5])

plt.plot(train_score)
plt.plot(test_score)
plt.show()