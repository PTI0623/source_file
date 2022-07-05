package ex0705;

class AA{
	int a = 10;
}

public class ex04 {
	public static void setAA(AA a) {
		a.a=100;
		System.out.println("a.a="+a.a);	
	}
	public static void main(String[] args) {
		AA aa = new AA();
		AA a2=aa;
		setAA(aa);
		//System.out.println(aa.a);
		//setAA(new AA());
		
		aa=null;
		System.out.println(a2.a);
		System.out.println(aa.a);
	}
}
