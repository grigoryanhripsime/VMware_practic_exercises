package VMware_practic_exercises.finalExercises;
import java.util.List;

/*
Given the root of a binary tree, flatten the tree into a "linked list":
The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list
and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 */
public class Ex5 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(30);
        tree.insert(25);
        tree.insert(35);
        tree.insert(23);
        tree.insert(34);
        tree.insert(37);
        tree.insert(20);
        tree.insert(24);
        tree.insert(36);
        tree.insert(22);
        tree.insert(21);

        List<Integer> list = tree.preOrderIterative();

        tree.print(tree.newTree(list));
    }

}