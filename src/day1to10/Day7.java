package day1to10;

public class Day7 {

	public static void main(String[] args) {
		//Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded => Facebook => Medium
		//Sol - https://www.geeksforgeeks.org/count-possible-decodings-given-digit-sequence/ => 2nd one
		
		String coded = "11";
		int[] dp = new int[coded.length() + 1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= coded.length(); i++) {
			if(coded.charAt(i - 1) > '0') {
				dp[i] += dp[i - 1];
			}
			if(coded.charAt(i - 1) < '7' && ((coded.charAt(i - 2) == '1') || (coded.charAt(i - 2) == '2'))) {
				dp[i] += dp[i - 2];
			}
		}		
		
		System.out.println(dp[coded.length()]);
	}

}
