import cv2
import numpy as np
import matplotlib.pyplot as plt

#흑백처리, 컬러로 출력
woyo = cv2.imread('woyo.png',cv2.IMREAD_GRAYSCALE)
#pltwoyo = cv2.cvtColor(woyo,cv2.COLOR_RGB2BGR)

print(woyo.shape)

plt.scatter([10,20,30],[10,20,30],s=1000)
plt.text(100,200,'hihihi')
plt.axis('off')

#우리가 아는 흑백 cmap='gray'

plt.imshow(woyo, cmap='gray')
plt.show();