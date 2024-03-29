import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split, GridSearchCV
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import cross_validate

data = pd.read_csv('wine.csv')
print(data.head())

x = data[['alcohol','sugar','pH']].to_numpy()
y = data['class'].to_numpy()

train_input, test_input, train_target, test_target \
    = train_test_split(x,y,test_size=0.2,random_state=42)

sub_input, val_input, sub_target, val_target \
    = train_test_split(train_input,train_target,test_size=0.2,random_state=42)

print(train_input.shape)
print(sub_input.shape)
print(val_input.shape)

index0 = (val_target== 0)
print(index0)
index1 = (val_target ==1)
print(index1)

# plt.scatter(val_input[index0,1],val_input[index0,0],c="#ff0000")
# plt.scatter(val_input[index1,1],val_input[index1,0],c="#0000ff")
# plt.show()

print(test_input)
plt.show()
dt = DecisionTreeClassifier(random_state=42);
dt.fit(sub_input,sub_target)

훈련점수 = dt.score(sub_input,sub_target)
테스트점수 = dt.score(test_input,test_target)

print(훈련점수)
print(테스트점수)

pred= dt.predict([[9.4,1.9,3.51],val_input[10]])
print(pred)
print(val_target)

print(dt.feature_importances_)

scores = cross_validate(dt,train_input,train_target)
print(scores)

import numpy as np

print(np.mean(scores['test_score']))
from sklearn.model_selection import StratifiedKFold
splitter =\
    StratifiedKFold(n_splits=10,shuffle=True,random_state=42)
scores = cross_validate(dt,train_input,train_target,cv=splitter)
print(scores)
print(np.mean(scores['test_score']))


params = {
          'min_impurity_decrease': np.arange(0.0001, 0.001, 0.0001),
          'max_depth': range(5, 20, 1),
          'min_samples_split': range(2, 100, 10)
          }

gridcv = GridSearchCV(DecisionTreeClassifier(random_state=42),params,n_jobs=-1)
gridcv.fit(train_input,train_target)
dt = gridcv.best_estimator_
print(gridcv.best_params_)
print(np.max(gridcv.cv_results_['mean_test_score']))
