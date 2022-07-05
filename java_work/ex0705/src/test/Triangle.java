package test;

public class Triangle {
	public int width;
	public int height;
	
	public Triangle(int w,int h) {
		width=w;
		height=h;
	}
	public void area() {
		double area=(width*height)/2;
		System.out.println(area);
	}
	public void change(int w, int h) {
		width=w;
		height=h;
	}
}
