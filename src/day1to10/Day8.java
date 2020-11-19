package day1to10;

import java.util.LinkedList;
import java.util.Queue;

public class Day8 {
	static int count;
	public static void main(String[] args) {
		// UniVal tree => a tree where all nodes under it have the same value => Google => Easy
		
		count = 0;
		
		//TreeNode root = createTree("0,1,0,null,null,1,0,1,1");
		TreeNode root = createTree("1,1,1,null,null,1,1,null,null,null,2");
//		TreeNode root = createTree("1,3,2,null,null,2,2,null,null,null,2");
		path(root);
		
		System.out.println(count);
	}
	
	static boolean path(TreeNode root) {
		if(root == null) {
			return true;
		}
		
		boolean leftCheck = path(root.left);
		boolean rightCheck = path(root.right);
		
		if(!leftCheck || !rightCheck) {
			return false;
		}
		
		if(root.left != null && root.val != root.left.val) {
			return false;
		}
		if(root.right != null && root.val != root.right.val) {
			return false;
		}
		count++;
		return leftCheck || rightCheck;
		
	}
	
	static public class TreeNode{
		int val;
		TreeNode left, right;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	public static TreeNode createTree(String tree) {
		String[] nodes = tree.split(",");
		
		if(nodes.length == 0 || nodes[0].equals("null")) {
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
