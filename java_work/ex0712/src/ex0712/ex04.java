package ex0712;

public class ex04 {
	public static void main(String[] args) {
		AA[] ar = new AA[5];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar.length);
		ar[0]=new AA("홍길동");
		ar[1]=new AA("박태일");
		System.out.println(ar[0].toString());
		System.out.println(ar[1]);
	}
}
