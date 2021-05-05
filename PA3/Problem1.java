/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program calculates batting averages of baseball players with four decimal places. 
 * Bugs: None
 */

import java.util.*; 

public class Problem1 {
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in); 
    
    System.out.println("Enter the number of times the player was at bat: ");
    int bat = console.nextInt();
    
    System.out.println("Enter the number of hits the player has earned :"); 
    int hit = console.nextInt();
    
    System.out.printf("The batting average of the player is %.4f\n", average(bat,hit)); //rounds to 4 decimal places
  }
  
  public static double average(int bat, int hit) { 
    double average=((double)hit/(double)bat); //calculates batting average from number of bats and hits
    return average; 
  }
} 
 
    