package day1to10;

public class info {

	public static void main(String[] args) {
		// TODO Day5 Day6
		//Day 1 => Two Sum => HashMap
		//Day 2 => Product of all elements except itself => left variable and right var use to find product in O(N)
		//Day 3 => Serialize and Deserialize the tree => Serialize => split the string, then use a index variable i and then use % operator to attach using queue
		//		=> Deserialize the tree => define a result variable, then check size of queue and use .left and .right to append to the poll TreeNode
		//Day 4 => Find first missing positive integer => Use inplace swaping during this whenever we swap do -- for index and use another loop to find the answer
		//Day 5 =>
		//Day 6 =>
		//Day 7 => Number of ways to decode a message when a = 1, b = 2.... z = 26. We can either combine 2 characters of not combine. if combine take i - 2 possibilities
		//         if not combining the take i - 1 possibilities. i is index
		//Day 8 => Number of unival subtrees => using bottom up approach use check for all subtrees if it will be a unival tree or not and then count them
		//Day 9 => Largest sum with non adjacent values => House Robber => Here, the approach is either we can rob the current house or we don't rob the current house
		//		   Just check if the sum of i - 2 val with current val is max or the i - 1 is max. Depending on those we either rob the current house or we won't
		//Day 10 => 
	}

}
