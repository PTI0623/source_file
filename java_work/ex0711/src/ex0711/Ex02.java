package ex0711;

public class Ex02 {
	
	public Ex02() {}
	public Ex02(int a) {
		System.out.println("a = "+a);
	}
	public Ex02(int a,int b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void main(String[] args) {
		new Ex02(); //참조하는 변수가 없어서 생성하자마자 없어짐.
		new Ex02(10);
		new Ex02(10,20);
	}
}
