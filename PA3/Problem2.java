/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program produces a full name in pig latin with the first letter capitalized
   for the first and last name. 
 * Bugs: None
 */

import java.util.*; 

public class Problem2 {
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in); 
    System.out.println("Please enter your first name: ");
    String first=console.next();
    
    System.out.println("Please enter your last name: ");
    String last=console.next(); 
    
    System.out.print(pig(first).substring(1,2).toUpperCase()+pig(first).substring(2)+pig(first).charAt(0)+"ay ");
    //prints first name in pig Latin 
    System.out.print(pig(last).substring(1,2).toUpperCase()+pig(last).substring(2)+pig(last).charAt(0)+"ay");
    //prints last name in pig Latin 
  }
    
  public static String pig(String name){
    String name1=name.toLowerCase(); //converts first and last name into lower case 
    return name1; 
  }
} 