/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 13 November 2016
 * PA 6 - This program mimics the guessing rules from the game show The Price is Right.
 * Bugs: none
 */

import java.util.*;

public class Problem3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the number of integers in the bids: ");
    //prompts the users for the number of integers in the array
    int number = console.nextInt();
    int[] bids = new int[number]; //creates an array
    for (int i = 0; i < number; i++) {
      System.out.print("Number " + (i + 1) + " is: "); //prompts users to enter the integers one by one
      bids[i] = console.nextInt();
    }
    System.out.print("Enter the correct price of the item: "); //prompts for correct price
    int price=console.nextInt();
    System.out.println("The result is: "+priceIsRight(bids, price));
  }

  public static int priceIsRight(int[] bids, int a) {
    int closest=-1; //sets the base value of the closest value to be -1
    for (int i=0; i<bids.length; i++) { //goes over all the numbers in the array
      if (bids[i]<a && (a-bids[i])<=(a-closest)) {
        //the value of the number is smaller than the correct price and is the closest
        closest=bids[i];  
      }
    }
    return closest;
  }




}
