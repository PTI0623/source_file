from a import Friend

mylist=[Friend("윤지민","010-111-222"),Friend("이선준","010-333-444"),Friend("장지우","010-555-666"),Friend("윤지율","010-777-888")]


#객체안에 변수접근은 무조건 객체명.속성으로 작성하기
for f in mylist:
    if(f.name.startswith('윤')):
        print(f)

for f in mylist:
    if(f.name == '장지우'):
        f.phone = '010-999-999'
    print(f)
