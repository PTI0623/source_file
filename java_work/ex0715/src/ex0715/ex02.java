package ex0715;

interface A{
	
	//내용을 적으면 error
	public void doA();
	
}

public class ex02 implements A {
	public static void main(String[] args) {
		A a = new ex02();
		a.doA();
	}
	public void doA() {
		System.out.println("doA");
	}
}
