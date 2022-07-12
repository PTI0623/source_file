import won as w1
result= w1.areawon(3)
print(f"넓이는 = {result}")
#스트링 문자열 안에 변수 출력하고 싶을때!(파이썬3부터)
result= w1.cwon(2)
print(f"둘레는 = {result}")

num = float(input("반지름 입력"))
result = w1.areawon(num)
print(f"넓이는 = {result}")
result = w1.cwon(num)
print(f"둘레는 = {result}")