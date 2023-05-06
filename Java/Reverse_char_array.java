package VMware_practic_exercises.Java;

import java.util.Scanner;

public class Reverse_char_array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] arr = input.toCharArray();
		char temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		int prev = 0;
		for (int i = 0; i < arr.length; i++)
			if (i == arr.length - 1 || arr[i + 1] == ' ') {				
				for (int j = 0; j < (i - prev + 1) / 2; j++) {
					temp = arr[prev + j];
					arr[prev + j] = arr[i - j];
					arr[i - j] = temp;
				}
				prev = i + 2;
			}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}
}
