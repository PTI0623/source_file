package test;

public class ex01 {
	public static void main(String[] args) {
		Triangle tri = new Triangle(10,4);
		
		System.out.println("첫번째 삼각형");
		tri.area();
		tri.change(20, 5);
		System.out.println("두번째 삼각형");
		tri.area();
	}
}
