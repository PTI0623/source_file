def main():
    number=eval(input('숫자를 입력하세요'))
    if(number<0):
        print('입력한 값은 0보다 작습니다.')
    elif(0<=number<10):
        print('입력한 값은 0이상 10미만입니다.')
    elif(10<=number<20):
        print('입력한 값은 10이상 20미만입니다.')
    else:
        print('입력한 값은 20이상입니다.')
        
main()