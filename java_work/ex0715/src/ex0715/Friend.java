package ex0715;

public class Friend {
	private String name;
	private String major;
	private String phone;

	public Friend(String name, String major, String phone) {
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
