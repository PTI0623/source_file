def RangeTuple():
    r1=tuple(range(1,101,1))
    r2=tuple(range(100,0,-1))
    print(r1+r2)
RangeTuple()

mtuple = [i for i in range(100)]+[i for i in range(100,0,-1)]
a=tuple(mtuple)
print(a)