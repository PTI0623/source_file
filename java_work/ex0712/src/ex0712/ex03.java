package ex0712;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println(num1+" "+num2+" "+num3);
		System.out.println("합계 = "+sum);
		
	}
}
