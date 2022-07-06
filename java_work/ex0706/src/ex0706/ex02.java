package ex0706;

import myclass.ZZZ;//다른 패키지에 있을때 적어줌

public class ex02 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.doA();
		ZZZ zzz = new ZZZ();
		zzz.doA();
	}
}
