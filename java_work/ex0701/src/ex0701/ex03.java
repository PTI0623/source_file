package ex0701;

public class ex03 {

	public static void main(String[] args) {
		doA();
		int result=doB();
		System.out.println("result="+result);
		double d= doC();
		String s= doD();
		System.out.println("d="+d);
		System.out.println("s="+s);
	}

	public static void doA() {
		System.out.println("doA");
		return ;
	}

	public static int doB() {
		System.out.println("doB");
		return 10;
	}
	public static double doC() {
		return 10.5;
	}
	
	public static String doD() {
		return "메롱";
	}
	
}
