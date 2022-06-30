def bet_sum(n1,n2):
    sum=0
    for i in range(n1+1,n2,1):
        sum+=i
    print('sum=',sum)
bet_sum(2,5)
bet_sum(1,5)
bet_sum(1,6)
bet_sum(0,100)