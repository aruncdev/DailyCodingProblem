package day1to10;

import java.util.Arrays;

public class Day2 {

	public static void main(String[] args) {
		// Product of all elements except for that index => Uber => Hard
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(findProduct(arr)));
	}
	
	public static int[] findProduct(int[] arr) {
		int[] res = new int[arr.length];
		int left = 1, right = 1;
		
		for(int i = 0; i < arr.length; i++) {
			res[i] =  left;
			left = left * arr[i];
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			res[i] = res[i] * right;
			right = right * arr[i];
		}
		
		return res;
	}
}
