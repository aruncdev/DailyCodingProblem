package day1to10;

public class Day9 {

	public static void main(String[] args) {
		// Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. House Robber => Airbnb => Hard
		
		int[] nums = new int[] {5, 1, 1, 5};
		
		if(nums.length == 0) {
			System.out.println("0");
		}
		else if(nums.length == 1) {
			System.out.println(nums[0]);
		}
		else {
			System.out.println(maxAmount(nums));
		}

	}
	
	public static int maxAmount(int[] nums) {
		int[] dp = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}
		
		return dp[nums.length - 1];
	}

}
