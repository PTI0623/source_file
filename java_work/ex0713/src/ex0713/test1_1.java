package ex0713;

public class test1_1 {
	public static void matirx(int arr[][]) {
		
		int t=arr.length-1;
		for (int j = 0; j < arr[t].length; j++) {
			System.out.print(arr[t][j] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 012 0123 01234 012345
	// 201 3012 40123 501234
	//
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {36,36,36}, {10,11,12}, {13,14,15} };
		matirx(arr);
	}
}
