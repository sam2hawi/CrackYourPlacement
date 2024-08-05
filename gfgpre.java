class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        if (root == null) return;

        // If key is present at root
        if (root.key == key) {
            // the maximum value in left subtree is predecessor
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre[0] = temp;
            }

            // the minimum value in right subtree is successor
            if (root.right != null) {
                Node temp = root.right; // Corrected this line
                while (temp.left != null) {
                    temp = temp.left;
                }
                suc[0] = temp;
            }
            return;
        }

        // If key is smaller than root's key, go to left subtree
        if (key < root.key) {
            suc[0] = root;
            findPreSuc(root.left, pre, suc, key);
        } else { // go to right subtree
            pre[0] = root;
            findPreSuc(root.right, pre, suc, key);
        }
    }

