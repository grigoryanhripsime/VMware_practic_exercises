package VMware_practic_exercises.Java.Data_Structures;

public class Binary_tree {
    Node root;
    class Node {
        Node left;
        Node right;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
    public Binary_tree(int ... vals) {
        root = new Node(vals[0]);
        root.left = new Node(vals[1]);
        root.right = new Node(vals[2]);
        root.left.left = new Node(vals[3]);
        root.left.right = new Node(vals[4]);
        root.right.left = new Node(vals[5]);
        root.right.right = new Node(vals[6]);
    }

    //BFS
    public



}
