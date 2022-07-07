package ex0707;

public class Person {
	private String name;
	
	public Person() {}
	public Person(String name) {
		super();
		this.name = name;
	} //생성자
	//super 생략가능, this : 동일 변수명 생략불가
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Person name ="+name;
	} //생략가능, 객체정보 재선언하는 메소드(디폴트값:주소)
}	//this.name 써야하는데 this생략함
