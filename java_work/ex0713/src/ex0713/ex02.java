package ex0713;

class A{ //부모 A
	int a = 10;
	public void doA() {
		System.out.println("doa");
	}
}
class B extends A{ //자식 B(상속받음)
	public void doB() {
		super.doA();
		System.out.println("doB a = "+a);
		//super 대신 this나 안써도 알아서 찾아줌.
	}
}
public class ex02 {
	public static void main(String[] args) {
		B b = new B();
		b.doB();
	}
}
