/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program reads a positive integer value, and if the value is even, halves it;
   if it's odd, multiplies it by 3 and adds 1. It repeats this process until the value is 1,
   printing out each value and how many of the operations performed.
 * Bugs: none
 */

import java.util.*;

public class Problem3 {
  public static void main (String[] args) {
    Scanner console=new Scanner (System.in);
    System.out.print("Initial value is:");//prompts the users for an initial value
    int a=console.nextInt();
    if (a<1) { //if the integer is less than 1, prints 'error'
      System.out.println("Error");
    } else if (a==1) { //if the integer is 1 itself, makes the number of operations to be 0
      System.out.println("Final value 1, number of operations performed 0");
    } else {
      System.out.println("Final value 1, number of operations performed " + (number(a)+1));
    }
  }

  public static int number (int a) {
    int x=0; //sets the base value as 0
    for (int i=a; i>2;) {
      if (i%2==0) { //halves the value if the number is even
        i=i/2;
      } else { //multiplies the number by 3 and adds 1 if the number is odd
        i=3*i+1;
      }
      System.out.println("Next value is: " + i); //prints each value in the process
      x++; //calculates the number of operations
    }
    return x;
  }
}
