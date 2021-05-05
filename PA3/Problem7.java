/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program prompts for two integers representing a number of rows and 
   columns, and prints a grid of integers from 1 to (rows * columns) in column major 
   order.
 * Bugs: None
 */

import java.util.*; 

public class Problem7 {
  public static void main (String[] args) {
    System.out.println("Please enter an integer representing the number of rows: ");
    Scanner console=new Scanner (System.in); 
    int row=console.nextInt(); 
    System.out.println("Please enter an integer representing the number of columns: ");
    int column=console.nextInt(); 
    rowColumn(row, column); //prints a grid of integers from 1 to (rows*columns) 
  }
    
  public static void rowColumn(int row, int column) {
    for (int i=1; i<=row; i++) { //repeats the time of number of rows 
      for (int j=i; j<=row*column; j+=row) { //repeats the time of number of columns 
        System.out.print(j+"\t"); 
      }  
      System.out.println(); 
    }
  }
} 






















