class Solution {
    private   TreeNode prev = null;
    public void flatten(TreeNode root) {
       
        if(root==null)return ;
       
        if(root.right!=null)flatten(root.right);
        if(root.left!=null)flatten(root.left);
        root.left=null;
        root.right=prev;
        prev=root;
    }
}
