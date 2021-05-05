/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program calculates the number of pizzas needed for a party if each person 
   attending is expected to eat an average of four slices. 
 * Bugs: None
 */
 
import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter the diameter of the pizza in inches:");
        //directs users to enter the diameter 
        
        double diameter=console.nextDouble();
        double area=3.14*(diameter/2.0)*(diameter/2.0);
        //calculates the area of the pizza 
        
        System.out.println("Enter the number of people who will be at the party:"); 
        //directs users to enter the number of people 
        
        int people=console.nextInt(); 
        double number=(people*4*14.125)/area+1;
        //calculates the number of pizzas needed for the party 
        
        System.out.println("The number of pizzas to purchase is: " + (int) number);
        //prints the number of pizzas needed as an integer in a sentence 
    }
}
        