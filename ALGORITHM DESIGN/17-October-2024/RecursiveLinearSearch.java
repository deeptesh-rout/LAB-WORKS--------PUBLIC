public class RecursiveLinearSearch {
    public static int linearSearch(int[] array, int target, int index) { 
        if (index >= array.length) {
            return -1;
        }      
        if (array[index] == target) {
            return index;
        }   
        return linearSearch(array, target, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 2, 9, 6 };
        int target = 9;
        int result = linearSearch(numbers, target, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
