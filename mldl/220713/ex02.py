import numpy as np

a=[1,2,3,4,5]
np_array=np.array(a)

a=a*5
np_array = np_array*5
print('a:',a)
print('np_array:',np_array)

np.random.seed(42)
a = np.random.randint(1,100,5)
print(a)

np.random.seed(42)
index1= np.arange(49)

index=np.arange(49)
print(index)
np.random.shuffle(index)

np.random.seed(42)
np.random.shuffle(index1)
print(index)
print(index1)