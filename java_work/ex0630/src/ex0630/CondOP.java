package ex0630;

public class CondOP {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;

		int result = num1 > num2 ? num1 : num2;
		System.out.println("큰 수=" + result);

		result = num1 > num2 ? num1 - num2 : num2 - num1;
		System.out.println("절대값=" + result);
	}
}
