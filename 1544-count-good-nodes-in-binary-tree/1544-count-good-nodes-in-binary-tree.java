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
    int count = 0;
    public int goodNodes(TreeNode root) {
        solve(root, root.val);
        return count;        
    }
    public void solve(TreeNode root, int mx) {
        if(root != null){
            if(root.val >= mx){
            count++;
            mx = root.val;
            }
            solve(root.left, mx);
            solve(root.right, mx);   
        }     
    }
}