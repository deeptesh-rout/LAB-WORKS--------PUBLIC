public class MinMax {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 12, 3 };
        int max = findMax(array, 0, array[0]);
        int min = findMin(array, 0, array[0]);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static int findMax(int[] array, int index, int max) {
        if (index == array.length) {
            return max;
        }
        if (array[index] > max) {
            max = array[index];
        }
        return findMax(array, index + 1, max);
    }

    public static int findMin(int[] array, int index, int min) {
        if (index == array.length) {
            return min;
        }
        if (array[index] < min) {
            min = array[index];
        }
        return findMin(array, index + 1, min);
    }
}