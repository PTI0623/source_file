package ex0701;

public class ex01 {
	
	public static void doA() {
		System.out.println("안녕하세요222");
	}
	public static void doA(int a) {
		System.out.println("doA 메서드 시작");
		System.out.println("a="+a);
		System.out.println("doA 메서드 끝");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("시작");
		doA(20);
		doA(13);
		System.out.println("끝");
	}
}
