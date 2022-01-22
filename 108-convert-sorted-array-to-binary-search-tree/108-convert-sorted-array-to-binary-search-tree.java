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
        
        return helper(nums,0,nums.length-1);
    }
    
    public TreeNode helper(int[] n,int start,int end)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode x=new TreeNode(n[mid]);
        x.left=helper(n,start,mid-1);
        x.right=helper(n,mid+1,end);
        return x;
    }
}


