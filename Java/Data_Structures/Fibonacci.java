import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10).toString());
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }
        return list;
    }
}
