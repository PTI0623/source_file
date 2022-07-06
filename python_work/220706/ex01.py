from car import Car

car=Car()

while True:
    print("1.속도입력")
    print("2.속도입력")
    select= int(input())
    if select==1:
        print("속도 입력?")
        speed = int(input('속도입력하세요:'))
        car.setSpeed(speed)
        if speed == 100:
            print("속도위반")
            break
    else:
        result=car.getSpeed()
        print(result)
        break
      

