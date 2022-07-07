package ex0707;

//아무것도 안적으면 default : 같은 패키지내에서 호출가능. 다른패키지에서 호출불가
class Dog {

	@Override
	public String toString() {
		return "Dog []";
	}
	//alt+shift+s -> s toString			  __str__
	//alt+shift+s -> o 생성자(constructor) __init__
	//alt+shift+s -> r getter setter  	  안써도 됨.
}

//public class Cat{
//	@Override
//	public String toString() {
//		return "Cat []";
//	}
//	
//}
