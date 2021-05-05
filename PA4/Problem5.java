/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program prompts for a number (not bigger than 4999) and displays
 it in Roman numerals.
 * Bugs: none
 */

import java.util.*;

public class Problem5 {
  public static void main (String[] args) {
    Scanner console=new Scanner(System.in);
    System.out.println("Enter a positive integer not bigger than 4999.");//prompts for an integer
    int number =console.nextInt();
    System.out.println(convert(number));
  }

  public static String convert(int number) {
    String roman=""; //sets the base value of the roman numberal as blank
    for (int i=number; i>0;) {
      if (i>=1000) {
        roman+="M"; //if the value is bigger than 1000, adds 'M'
        i-=1000; //substracts 1000 from the value
      } else if (i>=900) {
        roman+="CM"; //if the value is bigger than 900, adds 'CM'
        i-=900; //substracts 900 from the value
      } else if (i>=500) {
        roman+="D"; //if the value is bigger than 500, adds 'D'
        i-=500; //substracts 500 from the value
      } else if (i>=400) {
        roman+="CD"; //if the value is bigger than 400, adds 'CD'
        i-=400; //substracts 400 from the value
      } else if (i>=100) {
        roman+="C"; //if the value is bigger than 100, adds 'C'
        i-=100; //substracts 100 from the value
      } else if (i>=90) {
        roman+="XC";//if the value is bigger than 90, adds 'XC'
        i-=90; //substracts 90 from the value
      } else if (i>=50) {
        roman+="L"; //if the value is bigger than 50, adds 'L'
        i-=50; //substracts 50 from the value
      } else if (i>=40) {
        roman+="XL"; //if the value is bigger than 40, adds 'XL'
        i-=40; //substracts 40 from the value
      } else if (i>=10) {
        roman+="X"; //if the value is bigger than 10, adds 'X'
        i-=10; //substracts 10 from the value
      } else if (i>=9) {
        roman+="IX"; //if the value is bigger than 9, adds 'IX'
        i-=9; //substracts 9 from the value
      } else if (i>=5) {
        roman+="V"; //if the value is bigger than 5, adds 'V'
        i-=5; //substracts 5 from the value
      } else if (i>=4) {
        roman+="IV"; //if the value is bigger than 4, adds 'IV'
        i-=4; //substracts 4 from the value
      } else {
        roman+="I"; //if the value is bigger than 1, adds 'I'
        i-=1; //substracts 1 from the value
      }
    }
    return roman;
  }
}
