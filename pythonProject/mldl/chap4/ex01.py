import pandas as pd
import numpy as np
from sklearn.neighbors import KNeighborsClassifier
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
import matplotlib.pyplot as plt
from sklearn.linear_model import LogisticRegression
from scipy.special import expit

fish = pd.read_csv('fish_data.csv')
# fish.to_excel('fish_data.xlsx')

print(pd.unique(fish['Species']))
fish_input =fish[['Weight','Length','Diagonal','Height','Width']].to_numpy()
fish_traget= fish['Species'].to_numpy()

train_input,test_input,train_target,test_target\
    =train_test_split(fish_input,fish_traget,random_state=42)

ss = StandardScaler()
ss.fit(train_input)
train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

kn=KNeighborsClassifier(n_neighbors=3)
kn.fit(train_scaled,train_target)
예측값=kn.predict(test_scaled)
print(예측값[:5])
print(test_target[:5])

pre=[[242.,25.4,30.,11.52,4.02],[363.,29.,33.5,12.73,4.4555]]
pre_scaled = ss.transform(pre)
print(pre_scaled)
pre_value = kn.predict(pre_scaled)
print(pre_value)

score = kn.score(test_scaled,test_target)
print(score)

proba = kn.predict_proba(pre_scaled)
print(np.round(proba,decimals=4))

z=np.arange(-5,5,0.1)
phi=1/(1+np.exp(-z))

# plt.plot(z,phi)
# plt.xlabel('z')
# plt.ylabel('phi')
# # plt.show()

#훈련용
indexes= (train_target == 'Bream') | (train_target == 'Smelt')
도미빙어데이터 = train_scaled[indexes]
도미빙어타겟 = train_target[indexes]

print(도미빙어데이터.shape)
print(도미빙어타겟.shape)

lr = LogisticRegression()
lr.fit(도미빙어데이터,도미빙어타겟)

score = lr.score(도미빙어데이터,도미빙어타겟)
print(score)

#테스트용
indexes= (test_target == 'Bream') | (test_target == 'Smelt')
도미빙어데이터 = test_scaled[indexes]
도미빙어타겟 = test_target[indexes]

print(도미빙어데이터.shape)
print(도미빙어타겟.shape)

lr = LogisticRegression()
lr.fit(도미빙어데이터,도미빙어타겟)

score = lr.score(도미빙어데이터,도미빙어타겟)
print(score)

#lr분류로 검증 다시해보기
pre=[[242.,25.4,30.,11.52,4.02],[363.,29.,33.5,12.73,4.4555]]
pre_scaled = ss.transform(pre)

pre_value = lr.predict(pre_scaled)
print(pre_value)

z = lr.decision_function(도미빙어데이터)
print(z)

# 시그모이드 함수 expit()
# phi = 1/(1+np.exp(-z))
# print(phi)
#
# phi = expit(z)
# print(phi)

train_list = []
test_list = []

for i in range(1,100):
    lr = LogisticRegression(C=i,max_iter=1000)
    lr.fit(train_scaled,train_target)

    훈련데이터점수=lr.score(train_scaled,train_target)
    테스트데이터점수=lr.score(test_scaled,test_target)

    train_list.append(훈련데이터점수)
    test_list.append(테스트데이터점수)

print(train_list)
print(test_list)
print(np.argmax(train_list))
print(np.argmax(test_list))

plt.plot(range(1,100),train_list)
plt.plot(range(1,100),test_list)
plt.show()

pre=[[242.,25.4,30.,11.52,4.02],[363.,29.,33.5,12.73,4.4555],[1000.0,40.0,43.5,12.354,6.525]]
pre_scaled = ss.transform(pre)

pre_value = lr.predict(pre_scaled)
print(pre_value)