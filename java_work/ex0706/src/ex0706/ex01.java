package ex0706;

class Triangle{
	int width;
	int height;
	
	public Triangle() {}
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void printArea() {
		double area=width*height*0.5d; //이름 중복이 없어 여기서는 this안써도 클래스내 변수로 인식함.
		System.out.println("area="+area);
	}
}

public class ex01 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.printArea();
		t1.setHeight(50);
		t1.setWidth(50);
		t1.printArea();
		
		Triangle t2 = new Triangle(30,50);
		t2.printArea();
	}
}
