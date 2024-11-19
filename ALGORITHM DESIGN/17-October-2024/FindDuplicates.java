import java.util.Arrays;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = { 4, 2, 3, 4, 1, 2, 5 };
        findDuplicates(array);
    }
    public static void findDuplicates(int[] array) {

        Arrays.sort(array);
        boolean hasDuplicates = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.println("Duplicate found: " + array[i]);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
