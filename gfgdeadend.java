class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        
        return helper(root,1,Integer.MAX_VALUE);
    }
    public static boolean helper(Node root, long min,long max  ){
        if(root==null)return false;
        if(min==max)return true;
        return helper(root.left,min,root.data-1)||helper(root.right,root.data+1,max);
    }
}
