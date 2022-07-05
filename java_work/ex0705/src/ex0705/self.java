package ex0705;

public class self {

	public static int C(int n) {
		if (n == 0) {
			return 0;
		}
		return 10*(n%2+C(n/2));	
	} 
	public static void main(String[] args) {
		System.out.println(C(10)/10);
	}
}
