package ex0711;

public class ex03 {
	ex03(){
		bb b1 = new bb();
		System.out.println(b1.toString());
		
		System.out.println("abc".equals(new String("abc")) );
		System.out.println("abc"== new String("abc"));
	}
	public static void main(String[] args) {
		new ex03();
	}
}
