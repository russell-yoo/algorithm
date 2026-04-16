import java.util.*;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    class Node {

        int curSum;
        TreeNode x;

        Node(int curSum, TreeNode x) {
            this.curSum = curSum;
            this.x = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(new Node(root.val, root));

        while (!queue.isEmpty()) {
            Node current = queue.removeFirst();
            TreeNode left = current.x.left;
            TreeNode right = current.x.right;

            if (left != null) {
                int s = current.curSum + left.val;
                if (s == targetSum) {
                    return true;
                }
                queue.addLast(new Node(s, left));
            }

            if (right != null) {
                int s = current.curSum + right.val;
                if (s == targetSum) {
                    return true;
                }
                queue.addLast(new Node(s, right));
            }
        }
        return false;
    }
}
