package ex0712;

public class test {
	public static int minValue(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[i + j]) {
					temp = arr[i + j];
					arr[i] = arr[i + j];
					arr[i + j] = temp;
				}
			}
			return arr[0];
		}
		return 0;
	}

	public static int maxValue(int[] arr) {s
		int temp = 0;
		for (int e : arr) {
			if (e > e + 1) {
	
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 4, 5 };
		int result1 = minValue(a);
		System.out.println(result1);
		int result2 = maxValue(a);
		System.out.println(result2);

	}
}

/*
 * public static int maxValue(int[] arr) { for(int i=0;i<arr.length;i++) {
 * if(arr[i]>arr[i+1]) { arr[i]=arr[i+1]; arr[i+1]=arr[i]; } else {
 * arr[i+1]=arr[i]; arr[i]=arr[i+1]; } return arr[i]; } return 0; }
 * 
 */