package ex0630;

public class hw07 {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		for(n=1;n<100;n++) {
			if(n%2==1) {
				sum+=n;
				System.out.println("홀수 :"+n);
			}
			if(sum>1000)
				break;
		}
		System.out.println("1000을 넘어갈 때 홀수 :"+n);
		System.out.println("합계는 :"+sum);
	}
}
