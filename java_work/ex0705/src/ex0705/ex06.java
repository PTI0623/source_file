package ex0705;

public class ex06 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("0116", "9999-9999", 10000);
		ba.deposit(100000);
		ba.printbal();
		//BankAccount a2 = ba; 주소를 하나 늘린것
		BankAccount a2 = new BankAccount("12","1231",24);
	}
}
