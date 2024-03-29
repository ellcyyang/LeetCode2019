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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return gothrough(root1).equals(gothrough(root2));
    }
    
    public String gothrough(TreeNode root){
        if(root == null) return "";
        if(root.left == null && root.right == null){
            return root.val+"";
        }
        return gothrough(root.left)+gothrough(root.right);
    }
}