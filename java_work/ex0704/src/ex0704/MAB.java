package ex0704;

public class MAB {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Account a1 = new Account();//메모리 할당
		Account a2 = new Account();
		a1.deposit(10000);
		a1.deposit(10000);
		a2.deposit(10000);
	
		a1.check();
		a2.check();
		a1.withdraw(5500);
		a2.withdraw(3000);
		a1.check();
		a2.check();
	}
}
