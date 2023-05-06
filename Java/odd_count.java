package odd_count;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 3, 2, 4, 1, 1, 5, 3, 4, 1, 2};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i += 2) {
			if ((arr[i] ^ arr[i + 1]) != 0) {
				System.out.println(arr[i]);
				break;
			}
		}
		
	}
}
