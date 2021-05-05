/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program calculates the number of slices a pizza of any size can be divided into. 
 * Bugs: None
 */
 
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter the diameter of the pizza in inches:");
        //directs users to enter the input
        
        double diameter=console.nextDouble();
        double number=(3.14*(diameter/2.0)*(diameter/2.0))/14.125;
        //calculates the number of slices of the pizza 
        
        System.out.println("The number of slices is: " + (int) number);
        //prints the number of slices as an integer in a sentence
    }
}
        
 
 