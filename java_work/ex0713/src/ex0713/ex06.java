package ex0713;

//1. 부모클래스에 기본생성자 선언
//2. 자식클래스에 부모생성자랑 동일한 생성자를 선언

class AAA {
	protected int a;
	
	
	public AAA(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "AAA [a=" + a + "]";
	}

}

class BBB extends AAA {
	private int b;
	private int c;
	
	public BBB(int a, int b, int c) {
		super(a);
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "BBB [a=" + super.a + ",b=" + b + ",c=" + c + "]";
	}

}

public class ex06 {
	public static void main(String[] args) {
		System.out.println(new BBB(1, 2, 3));
	}
}
