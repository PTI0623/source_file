class B:
    def __init__(self,b) :
        self.b= b

    def getB(self):
        return self.b

for i in [B(10),B(20)]:
    print(i.getB())


