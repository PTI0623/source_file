package ex0630;

public class hw08 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i < 10; i++) {
			if (i == 2) {
				for (int k2 = 1; k2 < 10; k2++) {
					System.out.println("구구단" + i + "*" + k2 + "=" + i * k2);
					if (k2 == 2) {
						break;
					}
				}
			}
			if (i == 4) {
				for (int k4 = 1; k4 < 10; k4++) {
					System.out.println("구구단" + i + "*" + k4 + "=" + i * k4);
					if (k4 == 4) {
						break;
					}
				}
			}
			if (i == 6) {
				for (int k6 = 1; k6 < 10; k6++) {
					System.out.println("구구단" + i + "*" + k6 + "=" + i * k6);
					if (k6 == 6) {
						break;
					}
				}
			}
			if (i == 8) {
				for (int k8 = 1; k8 < 10; k8++) {
					System.out.println("구구단" + i + "*" + k8 + "=" + i * k8);
					if (k8 == 8) {
						break;
					}
				}
			}
		}
	}
}
