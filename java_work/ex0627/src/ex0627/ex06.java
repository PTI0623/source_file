package ex0627;

public class ex06 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		int result = n1 < n2 ? n1 : n2;
		System.out.println("resutl="+result);
		
		result = n1<n2 ? n2-n1 : n1-n2;
		System.out.println("resutl="+result);
	}
	
}
