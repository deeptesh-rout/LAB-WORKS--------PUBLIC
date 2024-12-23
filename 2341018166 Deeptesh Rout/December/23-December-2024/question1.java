
import java.util.Scanner;

public class question1 {

	@SuppressWarnings("resource")
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
		
		for(int i=0 ; i<size ; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
