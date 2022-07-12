package ex0708;

public class Ex02 {
	public static int a = 10;
	Ex02(){
		System.out.println("a ="+a);
	}

	public static void main(String[] args) {
		Ex02 ex02= new Ex02();
		ex02.a++;
		Ex02 ex02_1= new Ex02();
		ex02_1.a++;
		
		System.out.println("ex02.a = "+ex02.a);
	}
}