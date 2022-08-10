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
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(0,nums.length-1,nums);
    }
    public TreeNode create(int l, int h,int [] nums){
        if (l>h) return null;
        if (l==h) return new TreeNode(nums[l]);
        int m = (l+h)>>1;
        TreeNode left=create(l,m-1,nums);
        TreeNode right=create(m+1,h,nums);
        TreeNode root= new TreeNode(nums[m],left,right);
        
        return root;
    }
}