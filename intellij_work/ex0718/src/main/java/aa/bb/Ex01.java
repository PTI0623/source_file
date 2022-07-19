package aa.bb;
interface AA{
    int AAA = 345;
    void doA();
}
class AAA implements AA{
    public void doB(int a,String B, AA cd){

    }
    @Override
    public void doA() {
        System.out.println("AAA 클래스 안에 doA메서드");
    }
}
/*
    1. class를 만들어서 상속받아 재정의 하는방법
    2. new AA() 인터페이스 생성과 동시에 메서드 재정의하는 방법
 */
public class Ex01 {
    public static void main(String[] args) {
        System.out.println(AA.AAA);
        AAA a1 = new AAA();
        a1.doA();
        a1.doB(10, "문자열", ()->{});

        AA a2 = new AA() {
            @Override
            public void doA() {
                System.out.println("AA 인터페이스안에 doA메서드");
            }
        };
        a2.doA();
        AA a3 = ()->{
            System.out.println("a3람다안에 doA메서드");
        };
        a3.doA();
    }
}
