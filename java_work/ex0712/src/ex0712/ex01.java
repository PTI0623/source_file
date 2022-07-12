package ex0712;

public class ex01 {
	public static void main(String[] args) {
		
		String jumin = "990925-1012999";
		String a[]= jumin.split("-");
		System.out.println(a[0]);
		String array[] = a[0].split("");
		
		for(int i=0;i<6;i++) {
			System.out.println(array[i]);
		}
		System.out.print(a[1]);
	}
}
