package ex0708;

public class Ex03 {
	public static void doA() {
		System.out.println("DoA 메서드");
	}
	public void doB() {
		System.out.println("DoB 메서드");
	}
	public static void main(String[] args) {
		Ex03.doA(); //doA 바로호출가능
		Ex03 ex = new Ex03();
		ex.doB(); //doB heap 메모리에 올려야 호출가능
	}
}
