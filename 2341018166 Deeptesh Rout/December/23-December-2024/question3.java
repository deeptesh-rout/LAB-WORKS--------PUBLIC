import java.util.Arrays;
import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter The Size of the array ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the elements of the array ");
		
		for(int i=0; i<=size-1 ; i++) {
			array[i]= scanner.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("Smallest Element in the array "+array[0]);
		System.out.println("Largest Element in the array "+array[array.length-1]);
	}

}
