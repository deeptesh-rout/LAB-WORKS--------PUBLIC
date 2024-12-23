import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update largest and smallest
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        // Display results
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);

        scanner.close();
    }
}
