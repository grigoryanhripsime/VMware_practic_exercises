import java.util.ArrayList;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        System.out.println(count(5).toString());
    }

    public static List<Integer> count(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int c = 0;
            int j = i;
            while (j > 0) {
                if (j % 2 == 1) c++;
                j = j >> 1;
                System.out.println(i + " " + j);
            }
            list.add(c);
        }
        return list;
    }
}
