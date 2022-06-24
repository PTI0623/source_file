package ex0624;

public class CC {
	public static void main(String[] args) {
		short a = 32767;
		short b = 20;
		

		System.out.println("a+b= "+(a+b)); //코딩실수 "a+b=" ,(a+b) X
		
		short c = (short) (a+b); //구겨서 넣기
//		System.out.println("c= "+c);
//		short c = a+b;
	}
}
