from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

data = pd.read_excel('data.xlsx')
length = data['length'].to_numpy()
weight = data['weight'].to_numpy()
#target = data['target'].to_numpy()

data = np.column_stack((length, weight))
print(data[:5])
print(data.shape)

data5 = np.full((3, 3), 5)
# print(data5)

# print(np.ones(5))
fish_target = np.concatenate((np.ones(35), np.zeros(14)))
# print(fish_target)

train_input, test_input, train_target, test_target \
    = train_test_split(data, fish_target, random_state=42, stratify=fish_target)

print(train_input.shape)
print(test_input.shape)

print(train_target.shape)
print(test_target.shape)

kn=KNeighborsClassifier()
kn.fit(train_input, train_target)
score = kn.score(test_input,test_target)
prevalue = kn.predict([[25,150]])

dis, index = kn.kneighbors([[25,150]])
# print(dis)
# print(index)
# print(train_input[index])

# plt.scatter(train_input[:,0] , train_input[:,1])
# plt.scatter(test_input[:,0] , test_input[:,1])
# plt.scatter(25,150, marker='^')
# train 데이터 중 x좌표(0),y좌표(1),마커는 다이아몬드로
# plt.scatter(train_input[index,0], train_input[index,1], marker='D')
# plt.xlim((0,500))

#axis=0 행으로 axis=1 열로 계산해라
mean = np.mean(train_input, axis=0)
std = np.std(train_input, axis=0)
print(mean,std)
train_scaled = (train_input-mean)/std
test_scaled = (test_input-mean)/std

predata = (np.array([25,150])-mean)/std
print(predata)

kn=KNeighborsClassifier()
kn.fit(train_scaled,train_target)

score=kn.score(test_scaled,test_target)
print(score)

predictvalue=kn.predict([predata])
print(predictvalue)

dis,index= kn.kneighbors([predata])

plt.scatter(train_scaled[:,0],train_scaled[:,1])
plt.scatter(predata[0],predata[1],marker='^')
plt.scatter(train_scaled[index,0],train_scaled[index,1],marker='D')

plt.xlabel('length')
plt.ylabel('weight')
plt.show()