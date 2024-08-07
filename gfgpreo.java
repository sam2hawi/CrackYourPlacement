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
    int ind;
    public TreeNode bstFromPreorder(int[] preorder) {
       if(preorder==null)return null;
       ind =0;
       return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
       
    }
    public TreeNode healper(int[]pre, int start, int end){
        if(ind ==pre.length||pre[ind]<start||pre[ind]>end)return null;
        int val = pre[ind++];
        TreeNode node = new TreeNode(val);
        node.left=helper(pre,start,val);
        node.right=helper(pre,val,end);
        return node;
    }
}
