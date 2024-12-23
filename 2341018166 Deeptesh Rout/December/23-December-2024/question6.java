import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nThe sorted array is:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        input.close();
    }
}
