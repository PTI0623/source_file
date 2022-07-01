st=[1,2,3,4,5,6]

def change():
    st[0],st[5] = st[5],st[0]
    print(st[0:])

change()