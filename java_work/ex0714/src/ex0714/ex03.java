package ex0714;

class Super {

}

class Sub extends Super {

}

public class ex03 {
	public static void main(String[] args) {
		Super super1 = new Sub();
		Sub sub1 = (Sub)super1;
		
	}
}
