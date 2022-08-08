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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return check(root,p,q);
    }
    public TreeNode check(TreeNode root, TreeNode p, TreeNode q){
        if (root.val>p.val && root.val<q.val) {
            return root;
        }
        if (p.val<root.val && q.val<root.val){
            return check(root.left, p,q);
        }
        if (p.val>root.val && q.val>root.val){
            return check(root.right, p,q);
        }
        return root;
    }
}