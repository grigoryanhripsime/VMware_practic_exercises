public class SinglyLinkedList {
    public Node head;

    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }
    public void insert(int pos, int val) {
        if(pos < 0){
            return;
        }
        Node next = head;
        Node new_node = new Node(val);

        if(this.head == null && pos == 0){
            this.head = new_node;
            return;
        }
        if(pos == 0){
            new_node.next = this.head;
            this.head = new_node;
            return;
        }
        for (int i = 1; i < pos; i++) {
            if(next == null){
                return;
            }
            next = next.next;
        }
        if(next != null) {
            new_node.next = next.next;
            next.next = new_node;
        }
    }

    public void delete(int pos) {
        if (pos == 0) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return;
        }
        Node cur = head;
        for (int i = 0; i < pos - 1; i++) {
            if (cur == null) {
                System.out.println("end");
                return;
            }
            cur = cur.next;
        }
        cur.next = cur.next.next;

    }

    public void print() {
        Node next = head;
        while (next != null) {
            System.out.println(next.val);
            next = next.next;
        }
    }

    public int size() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
        }
        return count;
    }

    public void del_odd() {
        Node cur = this.head;
        for (int i = 0; i < this.size(); i++) {
            if (cur.val % 2 == 0)
                cur = cur.next;
            else
                delete(i);
        }
    }
}























public class SlinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(0, 3);
        list.insert(3, 10);
        list.insert(4, 5);
        list.insert(5, 11);
        list.insert(6, 3);
        System.out.println("Just print");
        list.print();
        System.out.println("Edited print");
        list.del_odd();
        list.print();

    }
}
