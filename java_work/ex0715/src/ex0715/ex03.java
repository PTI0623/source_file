package ex0715;

interface Printable{
	public void print(String doc);
	default void printCMYK(String doc) {
		System.out.println("컬러 프린터");
		print(doc);
	}
}
class SPrint implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc);
	}
}
class LGPrint implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("LG프린터");
		System.out.println(doc);
	}
}

public class ex03 {
	public static void main(String[] args) {
		Printable prn = new SPrint();
		prn.print("삼성-SP54852-1332");
		System.out.println();
		
		
		
		prn = new LGPrint();
		prn.print("삼성");
	
	}

}
