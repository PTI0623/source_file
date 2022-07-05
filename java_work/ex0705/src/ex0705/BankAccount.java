package ex0705;

public class BankAccount {
	String jumin;
	String acc;
	int bal;
	
	//생성자 = 클래스 이름과 동일해야함, 반환값X 초기화시키는 것.
//	public BankAccount() {}
	public BankAccount(String j,String a,int b) {
		jumin=j;
		acc=a;
		bal=b;
	}
	public void deposit(int b) {
		bal = bal +b;
	}
	public void printbal() {
		System.out.println("주민번호 ="+jumin);
		System.out.println("계좌번호 ="+acc);
		System.out.println("bal="+bal);
	}
	
	
}
