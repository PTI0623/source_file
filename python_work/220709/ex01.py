sum=0
class Accumulator:
    @staticmethod
    def add(i):
        global sum 
        sum=sum+i
    def showResult():
        print(sum)