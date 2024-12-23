public class question7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 4, 2, 7};

        // Iterate through the array to find duplicates
        System.out.println("Duplicate elements:");
        
   
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

           
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;  
                }
            }
            if (isDuplicate) {
        
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
