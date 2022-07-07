from zoo.Dog import Dog as d
from zoo.Cat import Cat
from zoo.Duck import Duck
class ex02():
    def __init__(self):
        self.dog=d() 
        self.cat=Cat()
        self.duck=Duck()
        # self.sound()
    def sound(self):
        self.dog.sound()
        self.cat.sound()
        self.duck.sound()
    

ez=ex02()
ez.sound()