package ex0701;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ex04 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = scan.nextInt();
		divide(num1,num2);
	}

	public static void divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("몫:"+(num1/num2));
		System.out.println("나머지:"+(num1%num2));
		
	}
}
