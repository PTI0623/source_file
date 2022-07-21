import sys

def doA():
    for i in [10,20,30,40,50,60,70,80,90,100,110,120,130,140]:
        yield i

def doA():
    yield from [10,20,30,40,50,60,70,80,90,100,110,120,130,140]

a=[10,20,30,40,50,60,70,80,90,100,110,120,130,140]
b=doA()

for i in range(0,3):
    print(next(b),end=' ')

print()
print(sys.getsizeof(a))
print(sys.getsizeof(b))