/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program displays the number of cups of each ingredient needed for 
   the specified number of cookies.
 * Bugs: None
 */
 
import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter the number of cookies you want to make:"); 
        //directs users to enter the number of cookies 
        
        int number=console.nextInt(); 
        double sugar=number*(1.5/48); 
        double sugar1=(int)(sugar*100)/100.00;
        //calculates the cups of sugar needed
        
        double butter=number*(1.0/48);
        double butter1=(int)(butter*100)/100.00;
        //calculates the cups of butter needed 
        
        double flour=number*(2.75/48);
        double flour1=(int)(flour*100)/100.00;
        //calculates the cups of flour needed 
        
        System.out.println("The number of cups of each ingredient needed is:");
        System.out.println(sugar1+" cups of sugar"); //prints the cups of sugar needed 
        System.out.println(butter1+" cups of butter"); //prints the cups of butter needed 
        System.out.println(flour1+" cups of flour"); //prints the cups of flour needed 
    }
}
        
        
        