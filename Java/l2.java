import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

//        switch (n) {
//            case 6:
//                System.out.println("Million");
//                break;
//            case 9:
//                System.out.println("Billion");
//                break;
//            case 12:
//                System.out.println("Trillion");
//                break;
//            case 15:
//                System.out.println("Quadrillion");
//                break;
//            case 18:
//                System.out.println("Quintrillion");
//                break;
//            case 21:
//                System.out.println("Sextillion");
//                break;
//            case 30:
//                System.out.println("Nonillion");
//                break;
//            case 100:
//                System.out.println("Googol");
//                break;
//            default:
//                System.out.println("Unknown power");
//        }

//        int input;
//        int max = -2147483648, min = 2147483647;
//
//        do {
//            try {
//                input = scanner.nextInt();
//            }
//            catch (Exception e){
//                System.out.println("max = " + max);
//                System.out.println("min = " + min);
//                break;
//            }
//
//            if (input > max){
//                max = input;
//            }
//            if (input < min) {
//                min = input;
//            }
//        }
//        while (true);


        char[][] array = new char[5][5];
        fillArray(array);
        printArray(array);

        int[][] arr = {
                {1, 2, 3},
                {3, 5, 6},
                {2, 4, 6},
        };
        System.out.println(sub(arr));
    }
    public static void fillArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || j == 0 || i == array.length - 1 || j == array.length - 1)
                    array[i][j] = '*';
                else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sub (int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][i] - array[i][array.length - i - 1];
            }
        return sum;
    }
}

