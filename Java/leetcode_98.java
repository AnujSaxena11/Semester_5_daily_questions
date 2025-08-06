/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public boolean isValidBST(TreeNode root) {
		return valid(root).isbst;
	} 
	    
	public  BSTpair valid(TreeNode root) {
	    if(root == null) {
	    	return new BSTpair();
	    }
	    BSTpair lbp = valid(root.left);
	    BSTpair rbp = valid(root.right);
	    BSTpair sbp = new BSTpair();
	    sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
	    sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
	    sbp.isbst = lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
	    return sbp;
	}
	    
	class BSTpair{
	    long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
	    boolean isbst = true;
	}
}