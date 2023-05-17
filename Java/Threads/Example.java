package Threads;

import java.util.ArrayList;
import java.util.List;


public class Example extends Thread {
    public static final int STEP = 10;
    public static List<Integer> commonList = new ArrayList<>();

    @Override
    public void run() {
        fillingCommonList();
    }

    public void fillingCommonList() {
        synchronized (commonList) {
            int start = 0;
            if (! commonList.isEmpty()) {
                start = commonList.size() - 1;
            }
            for (int i = start; i < start + STEP; i++) {
                commonList.add(i);
                System.out.println("Element " + i);

            }
        }

    }


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Example t = new Example();
            t.start();
//            try {
//                t.join();
//            }
//            catch (InterruptedException e) {
//                System.out.println("Aaaa");
//                System.out.println(e.getStackTrace());
//            }
        }
    }
}
