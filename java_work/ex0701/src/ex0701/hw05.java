package ex0701;

public class hw05 {
	public static int doexp(int num) {
		if(num==1) {
			return 2;
			}
		else{
			//System.out.println(num);
			return 2*doexp(num-1);
			}
		}
	public static void main(String[] args) {
		int b;
		b = doexp(5);
		int c = doexp(7);
		System.out.println("2의5승은" + b);
		System.out.println("2의7승은" + c);
	}
}
