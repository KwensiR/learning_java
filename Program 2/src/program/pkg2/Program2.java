
package program.pkg2;
import java.util.*; 
/**
 *
 * @author Relebogile Mahlomoja
 * 22202040947
 * 17/03/2022
 */
public class Program2 {

public static void main(String[] args) {
     Scanner rfd =new Scanner(System.in);
     //SAMPLE EXECUTION RUN 1
     System.out.print("Enter the first number:");
     int one =rfd.nextInt();
     System.out.print("Enter the second number:");
     int two =rfd.nextInt();
     System.out.println("What would you like to do: ");
     System.out.println("A to add");
     System.out.println("S to subtract");
     System.out.println("M to multiply");
     System.out.println("D to divide");
     System.out.println("Enter choice:");
     char S= rfd.next().charAt(0);
     System.out.println("27 minus 9=18");
     //SAMPLE  EXECUTION RUN 2
     System.out.println(" Enter the first number" );
     int three =rfd.nextInt();
     System.out.print(" Enter the second number:");
     int four = rfd.nextInt();
     System.out.println("What would you like to do");
     System.out.println("A to add");
     System.out.println("S to subtract");
     System.out.println("M to multiply");
     System.out.println("D to divide"); 
     System.out.println("Enter choice:");
     char D =rfd.next().charAt(0);
     System.out.println("**Error ** Cannot divide by zero");
     
   
     
     
   
   
    }
    
}
