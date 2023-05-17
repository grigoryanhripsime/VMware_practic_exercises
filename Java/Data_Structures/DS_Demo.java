package VMware_practic_exercises.Java.Data_Structures;

public class DS_Demo {
    public static void main(String[] args) {
        //creating a singlly linkedlist
        SingllyLinkedList list = new SingllyLinkedList();
        {
            System.out.println("Singlly LinkedList");
            list.add(1, 0);
            list.add(3, 1);
            list.add(19, 2);
            System.out.println(list.size());
            list.print();
            list.add(12);
            list.add(8);
            list.add(13, 13);
            System.out.println(list.size());
            list.print();
            list.del(0);
            list.print();
            System.out.println(list.size());
            list.del(2);
            list.print();
            list.del(10);
            list.del();
            list.print();
        }

        //creating a doublly linked list
        DoubllyLinkedList list1 = new DoubllyLinkedList();
        {
            System.out.println("Doublly LinkedList");
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.print();
            list1.add(12, 3);
            list1.add(10, 10);
            list1.print();
            System.out.println(list1.size());
            list1.del();
            list1.del(1);
            list1.print();
        }

        //creating a stack based on our linked list
        Stack stack = new Stack();
        System.out.println("this is stak");
        {
            System.out.println(stack.size());
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.print();
            stack.pop();
            stack.print();
            System.out.println(stack.peek());
            stack.print();
        }

        Queue queue = new Queue();
        System.out.println("This is queue");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.print();
        queue.pop();
        queue.print();
        System.out.println(queue.size());
    }
}
