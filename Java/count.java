public class count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2, 1, 2, 3, 1, 2, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum -= arr[i];
                    arr[j] = 0;
                    break;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
