package ex0714;

public class SmartPhone extends Phone {
	private String ver;

	public SmartPhone(String num, String ver) {
		super(num);
		this.ver = ver;
	}

	@Override
	public String toString() {
		return "SmartPhone [ver=" + ver + "]";
	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-9926-5435","갤럭시S21");
		System.out.println(sp.toString());
		sp.doPrint();
	}
	
}
