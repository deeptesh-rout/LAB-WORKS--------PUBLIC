public class FirstRepeatedElement {
    public static Integer findFirstRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; 
                }
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 3, 2, 5, 1 };
        Integer result = findFirstRepeated(arr);

        if (result != null) {
            System.out.println("First repeated element is: " + result);
        } else {
            System.out.println("No repeated elements found.");
        }
    }
}
