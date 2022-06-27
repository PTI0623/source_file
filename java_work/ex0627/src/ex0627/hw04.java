package ex0627;

public class hw04 {
	public static void main(String[] args) {
		
		int n=34;
		n= (n/10)+1;
		System.out.println(n);
		
		switch (n) {
		case 1:
			System.out.println("0이상 10미만의 수");
			break;
		//단순 나열??? 그러면 switch문 쓰는 이유가 없지않나? 근데 case 변수 들어가는거 int나 boolean 타입만 가능
		case 2:
			System.out.println("10이상 20미만의 수");
			break;
		case 3:
			System.out.println("20이상 30미만의 수");
			break;
		case 4:
			System.out.println("음수 혹은 30이상의 수");
			break;
		default:
			System.out.println("끝");
			break;
		}
	}
}
