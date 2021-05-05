/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 13 November 2016
 * PA 6 - This program accepts an array of integers and returns a boolean value
indicating whether or not the integers are unique (true for yes, false for no).
 * Bugs: none
 */

import java.util.*;

public class Problem1 {
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the number of integers in the array: ");
    //prompts the users for the number of integers in the array
    int number = console.nextInt();
    int[] numbers = new int[number]; //creates an array
    for (int i = 0; i < number; i++) { //prompts the users to enter the numbers one by one
      System.out.print("Number " + (i + 1) + " is: ");
      numbers[i] = console.nextInt();
    }
    System.out.println(isUnique(numbers)); //calls the method and prints the result
  }

  public static boolean isUnique (int [] numbers) {
    for (int i=0; i<numbers.length; i++) {  //goes over every number in the array
      for (int j=0; j<numbers.length; j++) { //goes over every number in the array
        if (i !=j && numbers[i]==numbers[j]) { //compares every number with every other numbers in the array
          return false; //returns false if two numbers are equal
        }
      }
    }
    return true;
  }
}
