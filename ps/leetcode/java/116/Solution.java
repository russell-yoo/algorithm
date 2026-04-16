import java.util.*;

class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

class Solution {

    static class X {

        int level;
        Node x;

        public X(int level, Node x) {
            this.level = level;
            this.x = x;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Deque<X> queue = new ArrayDeque<X>();
        X prev = null;
        queue.push(new X(0, root));
        while (!queue.isEmpty()) {
            X cur = queue.removeFirst();
            if (prev != null) {
                Node prevNode = prev.x;
                int prevLevel = prev.level;
                if (cur.level == prevLevel) {
                    prevNode.next = cur.x;
                    System.out.println(prev.x.val);
                    System.out.println(cur.x.val);
                }
            }
            prev = cur;
            if (cur.x.left != null) {
                queue.addLast(new X(cur.level + 1, cur.x.left));
            }

            if (cur.x.right != null) {
                queue.addLast(new X(cur.level + 1, cur.x.right));
            }
        }
        return root;
    }
}
