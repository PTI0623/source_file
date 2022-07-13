package ex0713;

class AA {
	AA() {
		System.out.println("AA 기본생성자");
	}
}

class BB extends AA {
	BB() {
		System.out.println("BB 기본생성자");
	}
}

public class ex05 {
	public static void main(String[] args) {
		new BB();
	}
}

//debug 모드 F5 함수안으로 F6 다음줄