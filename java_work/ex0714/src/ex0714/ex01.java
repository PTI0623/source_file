package ex0714;

public class ex01 {
	// 열(Column)
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

	// 행(Row)
	public static void printTwoArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			printArr(arr[i]);
			System.out.println();
		}
	}

	public static void addOne(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += add;
		}
	}

	public static void addTwo(int[][] arr, int add) {
		addOne(arr[0], add);
		addOne(arr[1], add);
		addOne(arr[2], add);
	}

	public static void main(String[] args) {
		int add = 10;
		int a[][] = { { 11 }, { 11, 22 }, { 11, 22, 33 } };
		//printTwoArr(a);
		addTwo(a,3);
		printTwoArr(a);

	}

}
