import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of pods followed by");
        System.out.println("the number of peas in pod: ");

        int numberOfPods = keyboard.nextInt();
        int peasPerPod = keyboard.nextInt();

        int total = numberOfPods * peasPerPod;

        System.out.print(numberOfPods + " pods and ");
        System.out.println(peasPerPod + " peas per pod.");
        System.out.println("The total number of peas = " + total);
    }
}
