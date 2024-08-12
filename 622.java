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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
       
        q.offer(new Pair(root,0));
        int ans=0;
      
        while(!q.isEmpty()){
             int first = 0, last = 0;
            int min = q.peek().getValue();
            int level = q.size();
            for(int i =0 ;i<level;i++){
            int c = q.peek().getValue()-min;
            TreeNode node = q.peek().getKey();
            q.poll();
            if(i==0)
            first=c;
            if(i==level-1)
            last=c;
            if(node.left!=null)q.add(new Pair(node.left,c*2+1));
            if(node.right!=null)q.add(new Pair(node.right,c*2+2));
            }
           ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}
