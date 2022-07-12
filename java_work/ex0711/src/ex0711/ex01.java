package ex0711;

public class ex01 {
	ex01(){
		AA aa = new AA();
		aa.doA();
		aa.doA(10);
		aa.doA(10,10);
	}//main안에서 올리면 static으로 올라가서
	//힙영역안에서 작업하기 위해서 위와같은 방식을 따름.
	public static void main(String[] args) {
		new ex01();
		
	}
}
