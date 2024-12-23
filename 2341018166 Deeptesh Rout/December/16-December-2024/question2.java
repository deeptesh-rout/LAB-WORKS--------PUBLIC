/*Q2. Write a program to convert a float to a Float object. (a) Autoboxing (b) Using 
Constructor 
 
JAVA CODE :- 
 
package mypackage; */
 
public class question2 { 
            public static void main(String[] args) { 
                float num = 42; 
 
                Float floatAutoboxed =num; 
                System.out.println("Float object (using autoboxing): " + floatAutoboxed); 
 
                @SuppressWarnings("removal") 
                Float floatUsingConstructor = new Float(num); 
                System.out.println("Integer object (using constructor): " + floatUsingConstructor); 
            } 
        } 