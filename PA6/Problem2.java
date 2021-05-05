/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 13 November 2016
 * PA 6 - This program accepts an array of integers and prints the length of
 the longest sorted sequence of integers in the array.
 * Bugs: none
 */

import java.util.*;

public class Problem2 {
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the number of integers in the array: ");
    //prompts the users for the number of integers
    int number = console.nextInt();
    int[] numbers = new int[number]; //creates an array
    for (int i = 0; i < number; i++) {
      System.out.print("Number " + (i + 1) + " is: "); //prompts the users to enter the integers
      numbers[i] = console.nextInt();
    }
    System.out.println("There are " +longestSortedSequence(numbers)+" value(s) in the longest sequence.");
  }

  public static int longestSortedSequence (int [] numbers) {
    int longest=1; //sets the base value of the longest sequence number to be 1
    int max=1; //sets the max of the longest sequence numbers to be 1
    for (int i=1; i<numbers.length; i++) { //goes over every number in the array
      if (numbers[i-1]<=numbers[i]) { //the condition that the number is smaller than the number after it
        longest++; //longest sequence number pluses one
        if (longest>max) {
          max=longest; //updates the max of the longest sequence numbers
        }
      } else {
        longest=1; //sets the longest sequence number to base value if it's smaller than max
      }
    }
    return max;
  }
}
