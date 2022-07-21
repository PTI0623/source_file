def doA():
    print("doA 111111111")
    yield 1
    print("doA 222222222")
    yield 2
    print("doA 333333333")
    yield 3
    print("doA 444444444")
    yield 4

a = doA()

print(type(a))
ret=next(a)
print(f'ret={ret}')
ret=next(a)
print(f'ret={ret}')
ret=next(a)
print(f'ret={ret}')
ret=next(a)
print(f'ret={ret}')
next(a)