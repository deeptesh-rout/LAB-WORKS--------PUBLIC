
import java.util.Scanner;



class Node {
    protected int regd_no;
    protected Node next;

    public Node(int regd_no) {
        this.regd_no = regd_no;
        this.next = null;
    }
}

public class linkedlisting {



    // Create a linked list with initial values
    public static void create(Node start) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter registration number:");
        int regd_no = scanner.nextInt();



        start.regd_no = regd_no;
        start.next = null;
    }





    // Display all nodes in the list
    public static void display(Node start) {
        Node current = start;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.println("Regd No: " + current.regd_no);
            current = current.next;
        }

    }





    // Insert at the beginning
    public static Node InsertBegining(Node start) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter registration number:");
        int regd_no = scanner.nextInt();



        Node newNode = new Node(regd_no);
        newNode.next = start;
        return newNode;
    }



    
    public class linkedlisting {
        public static void main(String[] args) {
            
        }
    }




}





