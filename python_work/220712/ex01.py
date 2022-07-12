class A:
    def __init__(self,a,b) :
        self.a=a
        self.b=b
    def getA(self):
        return self.a+self.b

for i in [A(10,20),A(20,20),A(40,30)]:
    print(i.getA())