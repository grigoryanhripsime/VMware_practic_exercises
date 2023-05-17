package VMware_practic_exercises.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Staying_alive {
    public static int index(int len, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int counter;
        for (int i = 1; i <= len; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            counter = 1;
            for (; counter < k; counter++) {
                queue.add(queue.remove());
            }
            queue.remove();
            counter = 1;
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println("There are 7 people and step is 2: " + index(7, 2));
        System.out.println("There are 10 people and step is 4: " + index(10, 4));
    }
}
