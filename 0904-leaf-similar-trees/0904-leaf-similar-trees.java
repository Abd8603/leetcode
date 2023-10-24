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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        solve(root1, lst1);
        solve(root2, lst2);
        return lst1.equals(lst2);        
    }
    public void solve(TreeNode root, List<Integer> lst1){
        if(root != null){
            if(root.left == null && root.right == null) lst1.add(root.val);

            solve(root.left, lst1);
            solve(root.right, lst1);
        }
    }
}