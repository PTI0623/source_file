package ex0705;

public class ex02 {
	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = a1;
		
		a1.a+=10;
		System.out.println("a2.a="+a2.a);
	}
}
