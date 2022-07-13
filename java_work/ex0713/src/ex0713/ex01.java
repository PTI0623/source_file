package ex0713;

public class ex01 {
	public static int minValue(int[] arr) {
		int min =arr[0];
		for(int i=0; i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int temp : arr) {
				if(max<temp) {
					max=temp;
				}
			}
		return max;
	}
	public static void main(String[] args) {
		int[] ary= {10,20,6,9,33,5};
		int min=minValue(ary);
		int max=maxValue(ary);
		System.out.println("최소값 :"+min);
		System.out.println("최대값 :"+max);
	}
}
