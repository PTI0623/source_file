package ex0630;

public class hw03 {
	public static void main(String[] args) {

		int n = 1;
		int sum = 0;
		while (n < 101) {
			if ((n % 2 == 0) && (n % 7 == 0)) {
				System.out.println("최소공배수는 :" + n);
				sum+=n;
			}
			n++; //while 꼭 증감연산자 써줘야함.
		}
		System.out.println("합계는 :" + sum);
	}
}
