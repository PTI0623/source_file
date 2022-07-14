package ex0714;
class Box{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}
class PaperBox extends Box{
	public void simpleWrap() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends Box{
	public void simpleWrap() {
		System.out.println("Gold Wrapping");
	}

public static void wrapBox(Box box) {
		box.simpleWrap();
}
	
public class test1 {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		3
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}		
	
}

