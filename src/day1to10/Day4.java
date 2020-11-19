package day1to10;

public class Day4 {

	public static void main(String[] args) {
		// find the first missing positive integer in linear time and constant space => Stripe => Hard
//		int[] arr = new int[] {3, 4, -1, 1};
//		int[] arr = new int[] {1, 2, 0};
//		int[] arr = new int[] {5, 4, 3, 2, 1};
		int[] arr = new int[] {2, 3, 1};
		
		System.out.println(missingNumber(arr));
	}

	public static int missingNumber(int[] arr) {
//		int count = 0;
		for(int i = 0; i < arr.length; i++) {
//			count++;
			if(arr[i] != i + 1 && arr[i] > 0 && arr[i] <= arr.length) {
				int pos = arr[i];
				arr[i] = arr[pos - 1];
				arr[pos - 1] = pos;
				i--;
			}
		}
//		System.out.print(Arrays.toString(arr));
//		System.out.println(count);
		for(int i = 0; i < arr.length; i++) {
			if(i+1 != arr[i]) {
				return i + 1;
			}
		}
		return arr.length + 1;
	}
}
