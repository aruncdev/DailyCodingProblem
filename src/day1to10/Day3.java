package day1to10;

import java.util.*;

public class Day3 {
	
//	static TreeNode root;
	static public class TreeNode{
		int val;
		TreeNode left, right;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		// serialize and deserialize the tree. => Google => Medium
		TreeNode root = serialize("1,2,3,null,null,4,5");
		
		String result = deserialize(root);
		
		System.out.println(result);
	}
	
	public static String deserialize(TreeNode root) {
		 String result = "";
		 
		 if(root == null) {
			 return null;
		 }
		 
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 queue.offer(root);
		 result = result + root.val;
		 
		 while(!queue.isEmpty()) {
			 int size = queue.size();
			 TreeNode temp;
			 
			 for(int i = 0; i < size; i++) {
				 temp = queue.poll();
				 
				 if(temp.left != null) {
					 queue.offer(temp.left);
					 result = result + "," + temp.left.val;
				 }
				 else {
					 result = result + ",null";
				 }
				 if(temp.right != null) {
					 queue.offer(temp.right);
					 result = result + "," + temp.right.val;
				 }
				 else {
					 result = result + ",null";
				 }
			 }
		 }
		 
		 
		 return result;
	}
	
	public static TreeNode serialize(String tree) {
		String[] nodes = tree.split(",");
		
		if(nodes.length == 0) {
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int i = 1;
		
		while(i < nodes.length) {
			TreeNode temp = queue.poll();
			
			if(i % 2 == 1) {
				if(!nodes[i].equals("null")) {
					TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
					queue.offer(left);
					temp.left = left;
				}
				i++;
			}
			if(i < nodes.length && i % 2 == 0) {
				if(!nodes[i].equals("null")) {
					TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
					queue.offer(right);
					temp.right = right;
				}
				i++;
			}
		}
		
		return root;
	}

}
