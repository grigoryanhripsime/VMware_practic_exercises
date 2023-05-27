package VMware_practic_exercises.finalExercises;

import java.util.ArrayList;
import java.util.List;

/*
Given an array A[1...n] of n integers,
define the maximum-subarray problem
as the problem of finding a nonempty contiguous subarray of A whose elements have the maximum sum.
(This problem is solved in O(nlgn)-time using the divide and conquer approach.)
Find and implement a bottom-up DP algorithm to solve this problem in O(n)-time.
Hint: Successively solve the subproblems P[1], P[2], ..., P[n],
where P[i] is the problem of finding a maximum subarray for A[1...i] (1 6 i 6 n) ending in position i.
Using the solution to P[i], find the solution to P[i + 1].
*/
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 5, -3, 7, 3, -8};
        System.out.println("Sum = " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
            else
                count--;
        }
        if (count == -arr.length) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }
        else if (count == arr.length) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (list.get(i - 1) < 0) {
                list.add(arr[i]);
            }
            else{
                list.add(list.get(i - 1) + arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        int max = 0;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

