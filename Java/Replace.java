public class Replace {
    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'J', 'a', 'v', 'a'};
        replace(arr);
    }
    public static void replace (char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
