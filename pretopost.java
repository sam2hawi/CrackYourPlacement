static class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        // code here
        return helper(pre,0,size);
    }    
    public Node helper(int []pre, int start, int end){
        if(start>end)return null;
        Node root = new Node(pre[start]);
        int i;
        for( i =start;i<=end;i++){
            if(pre[i]>root.data)
            break;
        }
        root.left=helper(pre,start,i-1);
        root.right=helper(pre,i,end);
        return root;
    }
    }
