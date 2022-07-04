package ex0704;

public class ex04 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		a1.doA();
		a1.doA();
		a2.doB();
		a2.doA();
		AA a3 = new AA();
		System.out.println("a3= "+a3.a);
	}
}
