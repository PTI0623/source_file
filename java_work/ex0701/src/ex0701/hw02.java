package ex0701;

public class hw02 {
	public static void abs(int num1,int num2) {
		if(num1>=num2) {
			System.out.println(num1-num2);
		}
		else {
			System.out.println(num2-num1);
		}
	}
	public static void main(String[] args) {
		abs(5,3);
		abs(3,5);
		abs(7,8);
		abs(8,8);
		
	}
}
