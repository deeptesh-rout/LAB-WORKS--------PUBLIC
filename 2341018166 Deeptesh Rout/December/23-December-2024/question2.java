
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The Size of the array ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of the array ");
		for(int i=0; i<=size-1 ; i++) {
			array[i]= scanner.nextInt();
		}
		System.out.println("The Elements of the array");
		int sum = 0;
		
		for(int i=0 ; i<size ; i++) {
			sum = sum + array[i];
		}
		
		System.out.println(sum);

        scanner.close();
	}

}
