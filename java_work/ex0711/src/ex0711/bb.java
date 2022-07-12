package ex0711;

public class bb {
	int a=10;
	bb(){
		this(20); //bb(int a)호출
		System.out.println("기본생성자");
	}
	bb(int a){
		System.out.println("a생성자");
		this.a= a;
	}
	//객체변수를 출력하면 주소값 나오지 않게 클래스에 대한 정보 입력하는 함수
	@Override
	public String toString() {
		return "bb [a=" + this.a + "]";
	}
	
}
