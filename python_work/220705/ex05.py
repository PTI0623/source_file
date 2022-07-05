def main():
    num=int(input("숫자를 입력하세요"))
    if(num%2==0) and (num%3==0):
        print(num,"num은 2의배수이며 3의배수이다.")
    else:
        print(num,'은 num입니다.')
main()