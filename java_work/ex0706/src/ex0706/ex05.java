package ex0706;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car c1 = new Car();
		
		while (true) {
			System.out.println("1. 속도입력");
			System.out.println("2. 속도출력");
			int result = scan.nextInt();
			if (result == 1) {
				System.out.println("속도입력:");
				int speed = scan.nextInt();
				c1.setSpeed(speed);
			} else {
				int speed = c1.getSpeed();
				System.out.println("현재 속도는" + speed);
			}
		}

	}
}
