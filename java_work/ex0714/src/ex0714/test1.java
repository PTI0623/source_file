package ex0714;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	@Override
	public void simpleWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends Box {

	@Override
	public void simpleWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class test1 {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new PaperBox();
		Box box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	public static void wrapBox(Box box) {
		box.simpleWrap();
	}

}
