import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("n = ");
        //int n = scanner.nextInt();

        //ex1
        //System.out.println(1 << n);

        //ex2
//        if (n / 2 == (double)n / 2) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        //ex3
        // System.out.print("position = ");
//        int position = scanner.nextInt();
//
//        if ((n & position) == 0) {
//            System.out.println("0");
//        }else{
//            System.out.println("1");
//        }

        //ex4
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();

        int plums_id = input.lastIndexOf("plums");
        input = input.substring(0, plums_id) + input.substring(plums_id).replace("plum", "appricote");

        input = input.replace("apple", "pear");
        System.out.println(input);

    }
}
