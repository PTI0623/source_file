package ex0714;

class A{

	@Override
	public String toString() {
		return "A []";
	}
	
	public void doA() {
		System.out.println("doA");
	}
	
}
class B extends A{

	@Override
	public String toString() {
		return "B []";
	}
	public void doA() {
		super.doA();
		System.out.println("doB");
	}
}
class C extends B{

	@Override
	public String toString() {
		return "C []";
	}
	public void doA() {
		super.doA();
		System.out.println("doC");
	}
}

public class ex02 {
	public static void main(String[] args) {
		A a1 = new C();
		A a2 = new B();
		A a3 = new A();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println();
		
		a1.doA();
		System.out.println();
		a2.doA();
		System.out.println();
		a3.doA();
	}
}
