str="The Espresso Spirit"
print(str.upper())
print(str.lower())
print(str)
cnt=0
for i in str:
    if i=='E':
        print(i)
        print(cnt)
    cnt+=1
print(str.find('E'))

myst = "한글입니다. \n잘되네요."
print(myst)

myst = "한글입니다. \t잘되네요."
print(myst)

myst = "한글입니다. \"잘되네요."
print(myst)

myst = "한글입니다. '잘되네요."
print(myst)

#쌍따옴표"" 안에 홀따옴표'' 가능, ''홀따옴표안에 "쌍따옴표 가능

mylist = [1,2,3,4,5]
del mylist[:]
print(mylist)