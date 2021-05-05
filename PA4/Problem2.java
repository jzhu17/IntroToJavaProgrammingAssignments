/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 20 October 2016
 * PA 4 - This program prints a pattern that contains different characters.
 * Bugs: none
 */

public class Problem2 {
  public static void main (String[] args) {
    for (int i=0; i<=5; i++) {
      star(i); //prints the star character
      space(i); //prints spaces
      left(i); //prints the '/' character
      right(i); //prints the '\' character
      space(i);
      star(i);
      System.out.println();
    }
  }

  public static void star (int i) {
    for (int j=0; j<5-i; j++) { //prints the star character 5-i times
      System.out.print("*");
    }
  }

  public static void space (int i) {
    for (int k=0; k<i+1; k++) { //prints the star character i+1 times
      System.out.print(" ");
    }
  }
  
  public static void left (int i) {
    for (int a=0; a<2*(5-i); a++) { //prints the '/' character 5-i times
      System.out.print("/");
    }
  }

  public static void right (int i) {
    for (int b=0; b<i*2; b++) { //prints the '\' character i*2 times
      System.out.print("\\");
    }
  }
}
