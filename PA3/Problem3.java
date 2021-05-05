/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program calculate and print 2 to the power of an integer as an exponent starting from 2^0. 
 * Bugs: None
 */

import java.util.*; 

public class Problem3 {
  public static void main (String[] args) {
    System.out.print("Please enter an exponent as an integer: ");
    Scanner console = new Scanner(System.in); 
    int input=console.nextInt();
    for (int i=0; i<=input; i++) {
      System.out.println(exponent(i)); //prints 2 to the power of the input starting from 2^0 
    }
  } 
  
  public static int exponent(int input) {
    int x=1; //creates a base value of 1 
    for (int i=1; i<=input; i++) {
      x*=2; //calculates 2 to the power of the input by multiplying 2 every time 
    }
    return x; 
  }
} 