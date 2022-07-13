package ex0713;

public class test1 {
	public static void addOne(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += add;
		}
	}

	public static void addTwo(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += add;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 1, 2, 3 }, { 1, 2 }, { 1 } };
		addOne(a, 2);
		addTwo(arr, 3);

//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
