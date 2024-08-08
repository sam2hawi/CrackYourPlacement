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
   private HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {     
        for(int i =0; i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return helper(preorder,0,preorder.length-1,0,postorder.length-1);
    
     }
     public TreeNode helper(int[]pre, int preStart, int preEnd, int postStart,int postEnd){
        if(preStart>preEnd)return null;
        int root= pre[preStart];
        if(preStart==preEnd)return new TreeNode(root,null,null);
        int postind=map.get(pre[preStart+1]);
        int len = postind -postStart+1;
        TreeNode left = helper(pre, preStart + 1, preStart + len, postStart, postind);
       TreeNode right = helper(pre, preStart + len + 1, preEnd, postind + 1, postEnd - 1);
TreeNode node = new TreeNode(root, left, right);
return node;
     }
}
