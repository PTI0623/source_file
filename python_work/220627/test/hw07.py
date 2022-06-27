def exp1(x,y):
    temp=x
    for i in range(1,y):
        temp=temp*x
        print(temp)
    print("exp=",temp)
exp1(3,4)