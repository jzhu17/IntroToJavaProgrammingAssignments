/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date:  17 Sep 2016
 * PA 2 - This program reads a four-digit positive integer and then displays it one 
   digit per line. 
 * Bugs: None
 */
 
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); 
        System.out.println("Enter a four-digit positive integer:"); 
        //directs users to type in corresponding input 
        
        int one = console.nextInt();  
        int first=one/1000; 
        int second=one/100-(first*10); 
        int third=one/10-(first*100+second*10); 
        int forth=one-(first*1000+second*100+third*10); 
        //calculates the first to the forth digit of the integer 
        
        System.out.println(first+"\n"+second+"\n"+third+"\n"+forth+"\n");
        //prints the four digits one digit per line 
    }  
}