package ex0701;

public class hw05 {
	public static int doexp(int num) {
		if(num==1) {
			return 2;
			}
		else{
			System.out.println(num);
			return 2*doexp(num-1);
			}
		}
	public static void main(String[] args) {
		int b;
		b = doexp(5);

		System.out.println("2의n승은" + b);
	}
}
