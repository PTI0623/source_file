package ex0701;

public class hw06 {
	// 십진수 -> 이진수 변환 반복 n%2== 출력 0 ->(n/2)%2==
	public static int ten(int n) {
		if (n == 0) {
			return 0;
		}

		else {
			int temp = n % 2;
			System.out.print(temp);
			return (n % 2) * ten(n / 2);
		}
	}

	public static void main(String[] args) {
		int t;
		t = ten(20);
	}
}
