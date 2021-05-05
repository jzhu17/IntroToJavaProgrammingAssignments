/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program asks for three integers, and displays the factorial of each of them 
 * Bugs: None
 */

import java.util.*; 

public class Problem5 {
  public static void main (String[] args) {
    System.out.println("Enter the first number: ");
    Scanner console=new Scanner (System.in); 
    int first=console.nextInt(); 
    
    System.out.println("Enter the second number: ");
    int second=console.nextInt(); 
    
    System.out.println("Enter the third number: ");
    int third=console.nextInt();
    
    System.out.println(first+"! ="+factorial(first)); //prints the factorial of the first number 
    System.out.println(second+"! ="+factorial(second)); //prints the factorial of the second number 
    System.out.println(third+"! ="+factorial(third)); //prints the factorial of the third number 
  }
     
  public static int factorial(int number) { 
    int x=1; //creates a base value of 1 
    for (int i=1; i<=number; i++) {
        x=x*i; //calculates the factorial of the number by multiplying by i every time 
    }
    return x; 
  } 
}