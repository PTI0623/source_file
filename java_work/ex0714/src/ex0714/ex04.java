package ex0714;

//Cake는 a,b참조 가능
class Cake{
	
}
class ACake extends Cake{
	public void doA() {
		System.out.println("Make ACake");
	}
}
class BCake extends Cake{
	public void doB() {
		System.out.println("Make BCake");
	}
}
public class ex04 {
	public static void main(String[] args) {
		Cake cake[] = new Cake[10];
		cake[0] = new ACake();
		cake[1] = new BCake();
		cake[2] = new ACake();
		cake[3] = new BCake();
		
		if(cake[0] instanceof ACake) {
			ACake ac = (ACake) cake[0];
			ac.doA();
		}
		if(cake[1] instanceof BCake) {
			BCake ab = (BCake) cake[1];
			ab.doB();
		}
		ACake ac3 = (ACake) cake[2];
		//BCake ac4 = (BCake) cake[2];
	}
}
