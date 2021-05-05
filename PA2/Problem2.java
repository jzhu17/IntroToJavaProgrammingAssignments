/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program convers temperature degrees from Fahrenheit to Celcius with one
   decimal place. 
 * Bugs: None
 */
 
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter an integer temperature in degree Fahrenheit:");
        //directs users to enter corresponding input
        
        int fahrenheit = console.nextInt(); 
        double celsius=5*(fahrenheit-32)/9.0; 
        //creates a variable that represents the input in degrees Celsius
        
        System.out.println(fahrenheit + " degrees Fahrenheit is " +(int)(celsius*10.0)/10.0
        + "degrees Celsius.");
        //prints a sentence that contains the input in degrees Celsius with one decimal place  
    }
}
