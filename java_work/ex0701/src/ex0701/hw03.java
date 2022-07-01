package ex0701;

public class hw03 {
	public static double area(double r) {
		return r*r*3.14;
	}
	public static double round(double r) {
		return 2*3.14*r;
	}
	public static void main(String[] args) {
		double result1=area(3);
		System.out.println("원의 넓이 :"+result1);
		double result2=round(3);
		System.out.println("원의 둘레 :"+result2);
	}
}
