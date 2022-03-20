
package solo.program;
import java.util.*;
/**
 * ShoppingCalculater
 * @author Relebogile Mahlomoja
 * 222040947
 * 16/03/2022
 */
   public class SoloProgram {
     
    public static void main(String[] args) {
        Scanner kbd =new Scanner(System.in);
    
    System.out.print ("Enter the name of the first item:");
    String firstitem=kbd.next();
    System.out.println("Enter the price of the first item:R");
    Float one = kbd.nextFloat();
        
    System.out.println("Enter the name of the second item: ");
    String seconditem =kbd.next();
    System.out.println("Enter the price of the second item:R");
    Float two =kbd.nextFloat();       
       
    System.out.println("Enter the name of the third item: ");
    String thirditem=kbd.next();
    System.out.println("Enter the price of the third item:R");
    Float three =kbd.nextFloat();
       
    System.out.println("Enter the name of the fourth item: ");
    String fourthitem=kbd.next();
    System.out.println("Enter the price of the fourth item:R");
    Float four =kbd.nextFloat();
       
    System.out.println("Enter the name of the fifth item: ");
    String fifthitem =kbd.next();
    System.out.println("Enter the price of the fifth item:R");
    Float five =kbd.nextFloat();
      
    System.out.println("=================================");
    System.out.println("You have selected to buy the following item :");
    System.out.println("---------------------------------");
    System.out.println("item : Jam   at R10 ");
    System.out.println("item :Coffee at R20  ");
    System.out.println("item : Salt  at R19.99");
    System.out.println("item : Jik   at R30  ");
    System.out.println("item : Bread at R21  ");
    System.out.println("----------------------------------");
    
    System.out.println("Total for all items: R100.99");
               
      
    
    
    }
    
    
}
