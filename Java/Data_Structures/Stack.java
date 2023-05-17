package VMware_practic_exercises.Java.Data_Structures;
import VMware_practic_exercises.Java.Data_Structures.SingllyLinkedList;
public class Stack extends SingllyLinkedList {
    private static int size = 0;
    public void push(int val) {
        this.add(val);
        size++;
    }
    public Node pop() {
        Node node = this.del();
        size--;
        return node;
    }

    public int peek() {
        Node node = pop();
        push(node.val);
        return node.val;
    }
    @Override
    public int size() {
        return this.size;
    }
}
