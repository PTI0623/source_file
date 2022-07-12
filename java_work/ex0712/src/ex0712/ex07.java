package ex0712;

public class ex07 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int sum = sumofary(a);
		System.out.println("sum="+sum);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
	public static int sumofary(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		a[0]=19;
		return sum;
	}
}
