package ex0705;

public class ex03 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = b1; //b2,b1 같은 객체를 가리킨다.
		
		System.out.println("b1.bal="+b1.bal);
		System.out.println("b2.bal="+b2.bal);
		
		b1.setBal(200);
		System.out.println("b1.bal = "+b1.bal);
		System.out.println("b1.bal = "+b2.bal);
		
		b2.setBal(300);
		int bbb= b1.getBal();
		System.out.println(bbb);
	}
}
