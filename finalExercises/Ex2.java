package VMware_practic_exercises.finalExercises;

/*
The integer function of two integer arguments F(m,n) is recursively defined for m ≥ 0 and n ≥ 0 as follows:
F(m,n) = m + n, if m == 0 || n == 0
F(m,n) = 3 * (m - 1, n - 1) + 1, if m + n % 2 == 1
F(m,n) = F(m - 1, n) + F(m, n - 1), if n + m % 2 == 0
Implement a top-down DP algorithm to calculate the F(m, n) and use the resulting code to calculate F(10, 11).
*/
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Result: " + function(10, 10));
    }
    public static int function(int m, int n) {
        if (m == 0 || n == 0) {
            return m + n;
        }

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = i + j;
                    continue;
                }
                if ((i + j) % 2 == 1) {
                    arr[i][j] = 3 * arr[i - 1][j - 1] + 1;
                }
                else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr[m - 1][n - 1];
    }
}