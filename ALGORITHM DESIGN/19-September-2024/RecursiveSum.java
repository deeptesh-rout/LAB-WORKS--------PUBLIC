public class RecursiveSum {
    public static int sum(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, -6, 12, 2, 3 };
        int sum = sum(arr, 0);
        System.out.println("Sum: " + sum);
    }
}