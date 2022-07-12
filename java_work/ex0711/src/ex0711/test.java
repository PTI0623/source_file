package ex0711;

public class test {
	public static void main(String[] args) {
		
//		String c ="990926";
//		String d = "-";
//		String e = "1012999";
//		d=" ";
//		System.out.println(c+d+e);
		
		StringBuilder str = new StringBuilder("990926-1012999");
		String a=str.delete(6, 7).insert(7," "+"1").toString();
		System.out.println(a);		
	}
}
