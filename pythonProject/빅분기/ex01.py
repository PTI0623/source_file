import pandas as pd
data = pd.read_csv('mtcars.csv')

# print(data.head())
# print(data.shape)
# print(data.columns)
# print(data.describe())
# print(data['hp'].describe())
print(data['am'].unique())
print(data.info())
print(data.corr())

X= data.drop(columns='mpg')
Y= data['mpg']

print(X.head())
print(Y.head())

#Unnamed 열 삭제
X=X.iloc[:,1:]
print(X.head())