def numFind():
    num=0
    cnt=0
    while cnt<100:
        if 3*(num/2)==63:
            break
        else:
            num+=1
        cnt+=1
    print(num)

numFind()

num=1
while 3*num/2!=63:
    num +=1