package Q450_DeleteNodeInABST;

class Solution {
    public int getPredecessorVal(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }

    public int getSuccessorVal(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) root.right = deleteNode(root.right, key);
        else if (root.val > key) root.left = deleteNode(root.left, key);
        else {
            if (root.left == null && root.right == null) root = null;
            else if (root.right != null) {
                root.val = getSuccessorVal(root);
                root.right = deleteNode(root.right, root.val);
            } else {
                root.val = getPredecessorVal(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }
}
