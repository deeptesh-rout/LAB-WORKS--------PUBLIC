import java.util.Scanner;

class Node {
    protected int regd_no;
    protected Node next;

    public Node(int regd_no) {
        this.regd_no = regd_no;
        this.next = null;
    }
}

public class linkedlist {

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

    // Insert at the end
    public static Node InsertEnding(Node start) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter registration number:");
        int regd_no = scanner.nextInt();

        Node newNode = new Node(regd_no);

        if (start == null) {
            return newNode;
        }
        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return start;
    }

    // Insert at a specific position
    public static Node InsertAnyPosition(Node start) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position:");
        int pos = scanner.nextInt();
        System.out.println("Enter registration number:");
        int regd_no = scanner.nextInt();
        Node newNode = new Node(regd_no);

        if (pos == 0) {
            newNode.next = start;
            return newNode;
        }

        Node current = start;

        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return start;
        }

        newNode.next = current.next;
        current.next = newNode;
        return start;

    }

    // Delete from the beginning
    public static Node DeleteBegining(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        return start.next;
    }

    // Delete from the end
    public static Node DeleteEnd(Node start) {
        if (start == null || start.next == null) {
            return null;
        }

        Node current = start;
        while (current.next != null) {
            current = current.next;
        }

        current.next = null;
        return start;
    }

    // Delete from any position
    public static Node DeleteAnyPosition(Node start) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter position:");
            int pos = scanner.nextInt();

            if (start == null) {
                System.out.println("List is empty. Cannot delete.");
                return start;
            }

            if (pos < 0) {
                System.out.println("Invalid position. Position cannot be negative.");
                return start;
            }

            if (pos == 0) {
                // Delete the first node
                Node newStart = start.next;
                start.next = null; // Help the garbage collector
                return newStart;
            }

            Node current = start;
            Node previous = null;

            // Traverse to the node before the one to delete
            for (int i = 0; i < pos && current != null; i++) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Position out of bounds.");
                return start;
            }

            // previous is the node before the one to delete
            if (previous != null) {
                previous.next = current.next;
                current.next = null; // Help the garbage collector
            }
        }
        return start;

    }

    public static Node reverse(Node start) {
        Node previous = null;
        Node current = start;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node start = null;
        int choice;

        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Reverse Linked List");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    if (start == null) {
                        start = new Node(0);
                        create(start);
                    } else {
                        System.out.println("List already created.");
                    }
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsertBegining(start);
                    break;
                case 4:
                    start = InsertEnding(start);
                    break;
                case 5:
                    start = InsertAnyPosition(start);
                    break;
                case 6:
                    start = DeleteBegining(start);
                    break;
                case 7:
                    start = DeleteEnd(start);
                    break;
                case 8:
                    start = DeleteAnyPosition(start);
                    break;
                case 9:
                    start = reverse(start);
                    System.out.println("List reversed.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
/* */