package ex0706;

public class  test01 {

	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showPointInfo();
		double area= c.areaCircle();
		System.out.println("넓이="+area);
		c.lengthCircle();
	}
}
