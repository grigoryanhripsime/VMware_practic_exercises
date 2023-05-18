package VMware_practic_exercises.Java.Data_Structures;

import java.util.ArrayList;

public class HeapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Max
//        list.add(30);
//        list.add(10);
//        list.add(20);
//        list.add(5);
//        list.add(7);
//        list.add(15);
//        list.add(6);
//        list.add(3);
//        list.add(2);
//        list.add(4);

        //Min
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(9);
        list.add(11);
        list.add(20);
        list.add(15);
        list.add(18);
        list.add(12);

        System.out.println(check(list));
        System.out.println(list);
    }
    public static String check(ArrayList<Integer> list) {
        int c = 0;
        for (int i = 0; i < list.size() - 3; i++) {
            if ((2 * i + 2) < list.size()) {
                if (list.get(i) > list.get(2 * i + 1) && list.get(i) > list.get(2 * i + 2)) {
                    c++;
                }
            }
        }
        if (c == Math.ceil(Math.log(list.size())) + 1) {
            return "Max";
        }
        return "Min";
    }

//    public static void convert(ArrayList<Integer> list) {
//        for (int i = list.size(); i > 0; i--) {
//
//        }
//    }
}
