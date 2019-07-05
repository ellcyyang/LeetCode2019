/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return maxDepth(root)!=-1;
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftlen = maxDepth(root.left);
        int rightlen = maxDepth(root.right);
        if(leftlen == -1) return -1;
        if(rightlen == -1) return -1;
        if(Math.abs(leftlen - rightlen)>1) return -1;
        return Math.max(leftlen, rightlen)+1;
    }
}