
package calculations;

import static java.lang.Float.sum;

/**
 *
 * @author relebogile
 */
public class Calculations {

    public static void main(String[] args) {
     int anint =10;
     int cube =(int)Math.pow(anint,3);
     //Math.pow gives a double .casting the double to an int
     int quotient=anint/7;
     int remainder=anint%7;
     int sum =1003;
     System.out.println("My first solo program");
     System.out.println("==============");
     System.out.println(""+ anint+" " +"cube is"+cube);
     System.out.println(""+anint+" "+ "divided by 7 is"+quotient+"rem"+remainder);
     System.out.println("The sum of" +cube +" " + "and"+" "+ remainder+" " + "is" +sum);
                   
    }
    
}
