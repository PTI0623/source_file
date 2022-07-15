import matplotlib
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsRegressor
from sklearn.metrics import mean_absolute_error

#한글 입력하는 방법 맑은 고딕체
matplotlib.rcParams['font.family'] ='Malgun Gothic'
matplotlib.rcParams['axes.unicode_minus'] =False

#데이터 읽어오기
data = pd.read_csv('chap3.csv')

#넘파이 데이터로 변환하기
length = data['length'].to_numpy()
weight = data['weight'].to_numpy()

#훈련데이터와 테스트 데이터 나누기
train_input,test_input,train_target,test_target=train_test_split(length,weight,random_state=42)
print(train_input.shape)
print(test_input.shape)

#파이썬 마지막 요소: -1, 42개의 요소(1행) 를 2차원 데이터 (42행,1열)에 넣는것
#sklearn함수 x항에 2차원 배열이 들어와야 예측가능
train_input=train_input.reshape(-1,1)
test_input=test_input.reshape(-1,1)
print(test_input)
#오차값 계산
maelist=[]

for i in range(1,20):
    knr = KNeighborsRegressor(n_neighbors=i)
    knr.fit(train_input, train_target)

    score = knr.score(test_input, test_target)

    predict_target = knr.predict(test_input)
    mae = mean_absolute_error(test_target,predict_target)
    maelist.append([i,mae])

maelist = np.array(maelist)
print(maelist)

knr =KNeighborsRegressor(n_neighbors=3)
knr.fit(train_input,train_target)
훈련점수 = knr.score(train_input,train_target)
테스트점수 = knr.score(test_input,test_target)
prediction = knr.predict(test_input)
mae=mean_absolute_error(test_target,prediction)
print('-------------------3------------------')
print('훈련점수',훈련점수)
print('테스트점수',테스트점수)
print('오차',mae)

knr =KNeighborsRegressor(n_neighbors=5)
knr.fit(train_input,train_target)
훈련점수 = knr.score(train_input,train_target)
테스트점수 = knr.score(test_input,test_target)
prediction = knr.predict(test_input)
mae=mean_absolute_error(test_target,prediction)
print('-------------------5------------------')
print('훈련점수',훈련점수)
print('테스트점수',테스트점수)
print('오차',mae)


x = np.arange(4,50).reshape(-1,1)
print(x)
for i in [1,5,10]:
    knr = KNeighborsRegressor(n_neighbors=i)
    knr.fit(train_input,train_target)
    prediction = knr.predict(x)
    plt.plot(x,prediction)
    plt.scatter(maelist[:, 0], maelist[:, 1], marker='D', color='red')
    plt.scatter(train_input, train_target)
    plt.scatter(test_input, test_target)
    plt.title(f"이웃되는 점 {i}개 일때 그래프") #f가 i를 말하는거임^^
    plt.xlabel('길이')
    plt.ylabel('무게')
    plt.show()

# 산점도로 나타내기 x축,y축 이름 지정
