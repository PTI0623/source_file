package ex0627;

public class hw02 {
	public static void main(String[] args) {
		int num1= 550;
		int num2= 100;
		int big;
		int diff;
		
		if(num1>num2) {
			big=num1;
			System.out.println("큰 수 : "+ big);
		}
		else if(num1<num2) {
			big=num2;
			System.out.println("큰 수 : "+ big);
		}
		if(num1>num2) {
			diff= num1-num2;
			System.out.println("절대값 = "+diff);
		}
		else if(num1<num2) {
		diff= num2-num1;
		System.out.println("절대값 = "+diff);
		}
		else {
			System.out.println("두 숫자는 같음");
		}
	}
}
