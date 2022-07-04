def show_reverse(st):
    for i in range(len(st)):
        if(st[i]>st[i+1]):
            st[i]=st[i+1]
        else:
            st[i]=st[i]
        if(i==5): return
    print(st)
st=[1,2,3,4,5]
show_reverse(st)
