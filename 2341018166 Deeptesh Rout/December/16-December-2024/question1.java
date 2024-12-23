
/* Write a program to convert an integer to an Integer object.  
(a) Autoboxing (b) Using Constructor  */

public class question1 { 
    public static void main(String[] args) { 
        int num = 42; 

        Integer integerAutoboxed =num; 
        System.out.println("Integer object (using autoboxing): " + integerAutoboxed); 

        @SuppressWarnings("removal")
        Integer integerUsingConstructor = new Integer(num); 
        System.out.println("Integer object (using constructor): " + integerUsingConstructor); 
    } 
} 