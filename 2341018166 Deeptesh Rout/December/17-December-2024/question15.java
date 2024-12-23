import java.util.Scanner;

public class question15 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        double sum = 0.0;
        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        // Output the result
        System.out.printf("The sum of the series is: %.6f\n", sum);
        scanner.close();
    }
}
