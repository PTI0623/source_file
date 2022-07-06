package ex0706;

class Circle2{
	private int rad;
	final double PI = 3.14;
	public void printArea() {
		System.out.println("넓이는 ="+PI*rad*rad);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if(rad< 0) {
			System.out.println("반지름은 음수가 없습니다.");
			return;
		}
		this.rad = rad;
	}
}
public class ex04_Circle {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		c1.setRad(10);
		System.out.println(c1.getRad());
		
		
	}
}
