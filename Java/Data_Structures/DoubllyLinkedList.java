package VMware_practic_exercises.Java.Data_Structures;

public class DoubllyLinkedList {
    private static int size = 0;
    Node head;

    class Node {
        Node prev;
        int val;
        Node next;
        public Node(int val) {
            this.prev = null;
            this.val = val;
            this.next = null;
        }
    }
    public int size() {
        return size;
    }

    //Adding element with index
    public void add(int val, int index) {
        Node new_node = new Node(val);
        if (index < 0) {
            System.out.println("Line 25");
            return;
        }
        if (index == 0) {
            if (head == null) {
                head = new_node;
            }
            else {
                this.head.prev = new_node;
                new_node.next = this.head;
                this.head = new_node;
            }
        }

        Node cur_node = head;

        for (int i = 1; i < index; i++) {
            if (cur_node == null) {
                System.out.println("Line 42");
                return;
            }
            cur_node = cur_node.next;
        }
        new_node.prev = cur_node;
        new_node.next = cur_node.next;
        cur_node.next = new_node;
        size++;
    }

    //Adding element at the end
    public void add(int val) {
        if (size() == 0) {
            head = new Node(val);
            size++;
            return;
        }
        int i = 1;
        Node cur = head;
        while (i < size()) {
            cur = cur.next;
            i++;
        }
        Node new_node = new Node(val);
        new_node.prev = cur;
        cur.next = new_node;
        size++;

    }

    //deleting element by index
    public void del(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Line 68");
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        for (int i = 1; i < index; i++) {
            if (cur.next != null)
                cur = cur.next;
            else {
                System.out.println("Line 90");
                return;
            }
        }
        cur.next = cur.next.next;
        cur.next.prev = cur;
        size--;
    }

    //deleting the last element
    public void del() {
        Node cur = head;
        for (int i = 1; i < size() - 1; i++) {
            if (cur.next != null) {
                cur = cur.next;
            }
            else {
                System.out.println("line 107");
                return;
            }
        }
        cur.next.prev = null;
        cur.next = null;
        size--;
    }


    public void print() {
        Node cur = head;
        for (int i = 0; i < size(); i++) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
