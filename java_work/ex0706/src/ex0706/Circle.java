package ex0706;


public class Circle{
	int xPos,yPos,rad;
	public Circle(int xPos, int yPos, int rad) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}

	public void setPos(int xPos,int yPos,int rad) {
		this.xPos = xPos; this.yPos = yPos; this.rad = rad;
	}
	public double areaCircle() {
		return rad*rad*3.14d;
	}
	public void lengthCircle() {
		System.out.println("둘레="+rad*2*3.14);
	}
	
	public void showPointInfo() {
		System.out.print("[원의(x,y)좌표]:");
		System.out.println("["+xPos+","+yPos+"]");
		System.out.println("반지름 r="+rad);
	}
	
}
