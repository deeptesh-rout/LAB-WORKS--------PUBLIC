public class question8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 4, 2, 7};
        System.out.println("Element Frequencies:");

        for (int i = 0; i < arr.length; i++) {
          
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }          
            if (!alreadyCounted) {
                int count = 0;            
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
