import java.util.Scanner;
import java.lang.Math;

public class l3 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int border = scanner.nextInt();
        int hidden_num = (int) (Math.random() * (border + 1));
        System.out.println(hidden_num);
        guess(hidden_num);
        guess2(hidden_num);
    }
    //recursive guessing game
    public static void guess(int hidden) {
        int num = scanner.nextInt();
        if (num == hidden)
            System.out.println("Congrates!");
        else if (num <= hidden) {
            System.out.println("Hidden number is bigger");
            guess(hidden);
        }
        else if  (num >= hidden) {
            System.out.println("Hidden number is smaller");
            guess(hidden);
        }
    }

    //iterative guessing game
    public static void guess2 (int hidden) {
        while (true) {
            int num = scanner.nextInt();
            if (num == hidden) {
                System.out.println("Congrates!");
                break;
            }
            else if (num <= hidden) {
                System.out.println("Hidden number is bigger");
            }
            else if  (num >= hidden) {
                System.out.println("Hidden number is smaller");
            }
        }
    }
}
