package day1to10;

import java.util.*;

public class Day1 {

	public static void main(String[] args) {
		// 2 sum question => Google => Easy
		int[] arr = new int[] {10, 15, 3, 7};
		int target = 17;
		
		if(targetExists(arr, target)) {
			System.out.println("Exists");
		}
		else {
			System.out.println("Does not Exist");
		}
	}
	
	public static boolean targetExists(int[] arr, int target) {
		Set<Integer> set = new HashSet<>();
		
		for(int temp: arr) {
			int need = target - temp;
			if(set.contains(need)) {
				return true;
			}
			set.add(temp);
		}
		return false;
	}

}
