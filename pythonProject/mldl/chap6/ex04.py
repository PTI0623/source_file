import numpy as np
import pandas as pd
from sklearn.cluster import KMeans
import matplotlib.pyplot as plt
import cv2

fruits = np.load('fruits_300.npy')
fruits_2d = fruits.reshape(-1,100*100)

km=KMeans(n_clusters=3, random_state=42)
km.fit(fruits_2d)
print(km.labels_)

print(np.unique(km.labels_,return_counts=True))

means = km.cluster_centers_.reshape(-1,100,100)
print(means.shape)

def draw_fruits(arr,ratio=1):
    n = len(arr)
    print('n=',n)
    rows = int(np.ceil(n/10))
    cols = n if rows <2 else 10
    fig, axs = plt.subplots(rows,cols,figsize=(cols*ratio,rows*ratio),squeeze=False)
    for i in range(rows):
        for j in range(cols):
            if i * 10 + j < n:
                axs[i, j].imshow(arr[i*10+j],cmap='gray_r')
            axs[i, j].axis('off')
    plt.show()
# rows = int(np.ceil(111 / 10))
# print(rows)
# cols = 11 if rows < 2 else 10
# print(cols)


draw_fruits(fruits[km.labels_==0])
draw_fruits(means,ratio=3)
print(km.transform(fruits_2d[100:101]))
draw_fruits(fruits[100:101])
print(km.n_iter_)

inertia = []
for k in range(2,7):
    km=KMeans(n_clusters=k,random_state=42)
    km.fit(fruits_2d)
    inertia.append(km.inertia_)

plt.plot(range(2,7),inertia)
plt.xlabel('k')
plt.ylabel('inertia')
plt.show()
