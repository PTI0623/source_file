dc = {'새우깡': 700 , '콘치즈':850, '꼬깔콘':750}
dc['홈런볼'] = 900

print(dc)
for i in dc:
    dc[i]+=100

for i in dc:
    print(dc[i], end=' ')

del dc['콘치즈']
print(dc)

dc['치즈콘']=950
print(dc)