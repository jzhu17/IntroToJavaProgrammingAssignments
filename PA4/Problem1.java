/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program reads a binary number as a string from the keyboard and
   then converts it into a decimal number.
 * Bugs: none
 */

import java.util.*;

public class Problem1 {
  public static void main (String[] args) {
    Scanner console=new Scanner (System.in);
    System.out.println("Please enter a binary number.");//prompts for a binary number
    String number=console.next();
    System.out.println(convert(number)); //prints the decimal number
  }

  public static int convert(String number) {
    int a=0; //sets the base value of each number added as 0
    int total = 0; //sets the base value of sum as 0
    for (int i=0; i<number.length(); i++) {
      a=((int)number.charAt(i))-48; //converts the character to an integer and turns it into 1 or 0
      a*=Math.pow(2,(number.length()-i-1)); //calculates the corresponding value of each 1 and 0
      total += a; //adds up the values
    }
    return total;
  }
}
