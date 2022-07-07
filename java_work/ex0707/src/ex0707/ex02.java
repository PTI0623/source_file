package ex0707;

import zoo.Duck;

public class ex02 {
		ex02(){ //생성자
		zoo.Dog dog = new zoo.Dog();
		zoo.Cat cat = new zoo.Cat();
		Duck duck = new Duck();
		sound(dog,cat,duck);
		}
		//함수
		public void sound(zoo.Dog dog,zoo.Cat cat,Duck duck){
			dog.sound();
			cat.sound();
			duck.sound();
		}
		public static void main(String[] args) {
			new ex02();//메인에서 생성 
		}
}


