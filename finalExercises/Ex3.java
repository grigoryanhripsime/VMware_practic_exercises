package VMware_practic_exercises.finalExercises;

/*
Let a, b, c be three keys
such that a < b < c and k ≥ 1 be an integer.
How many key comparisons will Quicksort exactly do depending on k with the sequence of 3k keys?
Assume that the pivot is always taken in the first position,
and the keys equal to pivot go to the right of splitPoint during Partition.
*/

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 5, 5};
        quickSort(arr, 0, arr.length);
        System.out.println(count);
    }


    static int count = 0;
    public static void quickSort(int[] arr, int start, int end) {
        boolean check = false;
        int pivot = arr[start];
        int pivot_index = start;
        for (int i = start + 1; i < end; i++) {
            count++;
            if (arr[i] < pivot) {
                arr[pivot_index] = arr[i];
                pivot_index = i;
                arr[i] = pivot;
                pivot = arr[i];
                check = true;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == pivot) {
//                int temp = arr[start + 1];
//                arr[start + 1] = arr[i];
//                arr[i] = temp;
//                start++;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(check);

        if (check) {
            quickSort(arr, 0, pivot_index);
        }
    }

}
