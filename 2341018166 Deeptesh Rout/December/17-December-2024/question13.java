import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int product = number * i ;

            System.out.println("the product of " + number +" and " +i+ " is " +product);
        }
    }
}
