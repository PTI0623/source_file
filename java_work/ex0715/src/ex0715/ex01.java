package ex0715;

public class ex01 {
	public static void main(String[] args) {

//		UniFriend uni = new UniFriend("홍길동", "컴공", "010-1111-1111");
//		uni.showInfo();
//		CompFriend com = new CompFriend("김경빈", "기계", "010-9878-5017");
//		com.showInfo();

//		UniFriend[] uarray = new UniFriend[10];
//		uarray[0] = new UniFriend("홍길동", "컴공", "010-1111-1111");
//		uarray[1] = new UniFriend("홍길동", "컴공", "010-1111-1111");
//		for (int i = 0; i < 2; i++) {
//			uarray[i].showInfo();
//		}
//		
		CompFriend[] array = new CompFriend[10];
		array[0] = new CompFriend("홍길김경빈동", "컴공", "010-1111-1111");
		array[1] = new CompFriend("김경빈홍길동", "컴공", "010-1111-1111");
		for (int i = 0; i < 2; i++) {
			array[i].showInfo();
		}
	}
}

class UniFriend {
	private String name;
	private String major;
	private String phone;

	public UniFriend(String name, String major, String phone) {
		super();
		this.name = name;
		this.major = major;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("부서 = " + major);
		System.out.println("전화 = " + phone);
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", major=" + major + ", phone=" + phone + "]";
	}

}

class CompFriend {
	private String name;
	private String department;
	private String phone;

	public CompFriend(String name, String department, String phone) {
		super();
		this.name = name;
		this.department = department;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("부서 = " + department);
		System.out.println("전화 = " + phone);
	}

}
