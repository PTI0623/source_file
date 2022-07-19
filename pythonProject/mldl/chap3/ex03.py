from sklearn.neighbors  import KNeighborsRegressor
import numpy as np

x1 = np.array([5,8,9,10,11,12,13,14,15,16,17,18])
x1 = x1.reshape(-1,3)
print(x1)

knr = KNeighborsRegressor(n_neighbors=3)
knr.fit(x1,[30,32,35,40])

pre_value=knr.predict([[12,13,14]])
print(pre_value)