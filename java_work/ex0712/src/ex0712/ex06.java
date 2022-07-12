package ex0712;

public class ex06 {
	public static void main(String[] args) {
		String ar[] = new String[3];
		System.out.println(ar[0]);
		
		ar[0]="abc";
		ar[1]="bdc";
		ar[2]="test";
		System.out.println(ar[0]);
//		System.out.println(ar[0].length());
//		System.out.println(ar[1].length());
//		System.out.println(ar[2].length());
//		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i].length());
		}
	}
}
