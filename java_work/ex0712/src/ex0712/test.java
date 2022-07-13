package ex0712;

public class test {
	public static int minValue(int[] arr) {
		int min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (min > arr[i]) {
				min=arr[i];
			}
			//System.out.println(min);
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int e : arr) {
			if (max < e) { //arr[e] -> 중복 배열된거임. e 안에 arr[0]~arr[6]
				max=e;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7 };
		int result1 = minValue(a);
		System.out.println(result1);
		System.out.println(maxValue(a));

	}
}

/*
 * public static int maxValue(int[] arr) { for(int i=0;i<arr.length;i++) {
 * if(arr[i]>arr[i+1]) { arr[i]=arr[i+1]; arr[i+1]=arr[i]; } else {
 * arr[i+1]=arr[i]; arr[i]=arr[i+1]; } return arr[i]; } return 0; }
 * 
 */