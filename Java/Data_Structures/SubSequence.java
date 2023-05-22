public class SubSequence {
    public static int[][] subSeq(String a, String b) {
        int[][] matrix = new int[b.length()+1][a.length()+1];
        for (int i = 1; i < a.length(); i++) {
            for (int j = 1; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                }
                else {
                    if (matrix[i][j - 1] > matrix[i - 1][j]) {
                        matrix[i][j] = matrix[i][j - 1];
                    }
                    else {
                        matrix[i][j] = matrix[i - 1][j];
                    }
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = subSeq("BDADCABB", "CBAADBAB");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
