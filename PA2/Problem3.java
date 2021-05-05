/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program determines the amount of change to be dispensed from a vending 
   machine, using the minimum number of coins. 
 * Bugs: None
 */
 
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter price of item\n(from 25 cents to a dollar, in 5-cents increments):");
        //directs users to enter the price
        
        int price = console.nextInt();
        int quarter = (100 - price)/25; 
        int dime = (100 - (price + 25 * quarter)) / 10;
        int nickel = (100 - (price + 25 * quarter + 10 * dime)) / 5; 
        //calculates the number of quarters, dimes and nickels needed for change
        
        System.out.println("You bought an item for "+price+" cents and gave me a dollar, so your change is:");
        System.out.println(quarter+" quarter(s),"); //prints the number of quarters needed for change
        System.out.println(dime+" dime(s),"); //prints the number of dimes needed for change
        System.out.println(nickel+" nickel(s)"); //prints the number of nickels needed for change 
    }
}
        