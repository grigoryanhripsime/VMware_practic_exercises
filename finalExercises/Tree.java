package VMware_practic_exercises.finalExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree<T> {
    public Node root;

    private class Node {
        public Node left = null;
        public Node right = null;
        public int data;

        public Node(int d) {
            data = d;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node current, int value) {
        if (current == null)
            return new Node(value);
        if (value < current.data) {
            current.left = insert(current.left, value);
        } else if (value > current.data) {
            current.right = insert(current.right, value);
        }
        return current;
    }

    public List<Integer> preOrderIterative() {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        while (curr != null || s.size() > 0) {
            while (curr != null) {
                list.add(curr.data);
                if (curr.right != null) {
                    s.push(curr.right);
                }
                curr = curr.left;
            }
            if (s.size() > 0)
                curr = s.pop();
        }
        return list;
    }

    public Node newTree(List<Integer> list) {
        Node root = new Node(list.get(0));
        Node temp = root;
        for (int i = 1; i < list.size(); i++) {
            temp.right = new Node(list.get(i));
            temp = temp.right;
        }
        return root;
    }
    public void print(Node root) {
        Node temp = root;
        System.out.print("Result: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }
}
