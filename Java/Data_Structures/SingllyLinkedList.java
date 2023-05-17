package VMware_practic_exercises.Java.Data_Structures;

import java.util.LinkedList;

public class SingllyLinkedList {
    private static int size = 0;
    Node head;

    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public int size() {
        return this.size;
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
        new_node.next = cur_node.next;
        cur_node.next = new_node;
        this.size++;
    }

    //Adding element at the end
    public void add(int val) {
        if (this.size() == 0) {
            head = new Node(val);
            this.size++;
            return;
        }
        int i = 1;
        Node cur = head;
        while (i < this.size()) {
            cur = cur.next;
            i++;
        }
        cur.next = new Node(val);
        this.size++;

    }

    //deleting element by index
    public void del(int index) {
        if (index < 0 || index > this.size()) {
            System.out.println("Line 68");
            return;
        }
        if (index == 0) {
            head = head.next;
            this.size--;
            return;
        }
        Node cur = head;
        for (int i = 1; i < index; i++) {
            if (cur.next != null)
                cur = cur.next;
            else {
                System.out.println("Line 74");
                return;
            }
        }
        cur.next = cur.next.next;
        this.size--;
    }

    //deleting the last element
    public Node del() {
        Node cur = head;
        for (int i = 1; i < this.size() - 1; i++) {
            if (cur.next != null) {
                cur = cur.next;
            }
            else {
                System.out.println("line 97");
                return null;
            }
        }
        Node node = cur.next;
        cur.next = null;
        this.size--;
        return node;
    }

    public void print() {
        Node cur = head;
        for (int i = 0; i < this.size(); i++) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
