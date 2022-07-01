package ex0701;

public class ex05 {
	public static void doA() {
		int num1=10;
		System.out.println(num1);
	}
	public static void main(String[] args) {
		boolean a = true;
		int num1=11;
		
		if(a) {
			System.out.println("a="+a);
			a=false;
		}
		{
			int num2=33;
			num2++;
			System.out.println(num2);
		}
		System.out.println(num1);
		doA();
	}
}
