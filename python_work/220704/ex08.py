a ="a,b,c,d,e,f,o"

a= a.replace("a","haha") #바꾼 값을 대입해야함.
print(a)

lista= a.split(',')
print(lista)

for i in lista:
    print('i',i)