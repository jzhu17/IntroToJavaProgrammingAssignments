/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program prompts the user for an integer n and then prints the first n Fibonacci numbers.
 * Bugs: None
 */

import java.util.*; 

public class Problem6 {
  public static void main (String[] args) {
    System.out.println("Please enter an integer: ");
    Scanner console=new Scanner (System.in); 
    int n=console.nextInt(); 
    for (int i=1; i<=n; i++) {
      System.out.print(fibonacci(i)+" "); //prints the corresponding number of Fibonacci numbers 
    } 
  }
  
  public static int fibonacci(int n) {
    int n1=0; //creates a base value of 0
    int n2=1;  //creates the second base value of 1 
    int n3=0; 
    for (int i=1; i<n; i++) {
      n3=n1+n2;  
      n1=n2;
      n2=n3;
    }
    return n1; 
  }
} 