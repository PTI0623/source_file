package ex0701;

public class hw04 {
		public static boolean Prime(int num) {
			if(num==1 || num==2) {
				System.out.println("소수입니다"+num);
				return true;
			}
			for(int i=2;i<100;i++) {
				if((num%i)==0) {
					if(num==i){continue;}
					System.out.println("소수아님"+num);
					return false;
				}
			}
			System.out.println("소수입니다"+num);
			return true;
		}
		public static void main(String[] args) {
			int num = 1;
			boolean result;
			while (num < 101) {
				result=Prime(num);
				System.out.println("소수인가요?" + result);
				num++;
			}
		}
	}

