package ex0704;
import java.util.Scanner;

public class ex01 {
	public static void ABS(int fi,int se) {
		if(fi>se) {
			System.out.print("abs= "+(fi-se));
		}
		else {
			System.out.print("abs= "+(se-fi));
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int fi=scan.nextInt();
		System.out.println("fi= "+fi);
		
		System.out.println("첫번째 수 입력");
		int se = scan.nextInt();
		System.out.println("se ="+se);
		System.out.println();
		
		ABS(fi,se);
		
	}
}
