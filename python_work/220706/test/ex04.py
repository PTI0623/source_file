lcm=0
num=1
while num<100:
    if(num%6==0 and num%45==0):
        lcm=num
    num=num+1
print(lcm)