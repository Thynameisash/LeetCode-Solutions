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
        int start = 0;
        int end = nums.length-1;
       
        return helper(start, end, nums);
    }
    
    public TreeNode helper(int s, int e, int nums[]){
        if(s>e){
            return null;
        }
        
        int m = (s+e)/2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = helper(s, m-1, nums);
        node.right = helper(m+1, e, nums);
        
        return node;
    }
   
}