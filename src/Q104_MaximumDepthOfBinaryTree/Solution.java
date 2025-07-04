package Q104_MaximumDepthOfBinaryTree;


import com.sun.source.tree.Tree;

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();
        if (root == null) return 0;
        stack.add(root);
        depths.add(1);
        int maxDepth = 0, currDepth = 0;
        while (!stack.isEmpty()) {
            root = stack.pollLast();
            currDepth = depths.pollLast();
            if (root != null) {
                maxDepth = Math.max(maxDepth, currDepth);
                stack.add(root.left);
                stack.add(root.right);
                depths.add(currDepth + 1);
                depths.add(currDepth + 1);
            }
        }
        return maxDepth;
    }
}
