/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 7 December 2016
 * PA 8 - This program lets users play the game of Mad-Lib.
 * Bugs: none
 */

import java.io.*;
import java.util.*;

public class MadLib {
  public static void main (String[] args) throws FileNotFoundException {
    PrintStream out1=System.out;
    Scanner console= new Scanner (System.in);
    out1.println("Welcome to the game of Mad Libs."); //introduces the game to the users
    out1.println("I will ask you to provide various words");
    out1.println("and phrases to fill in a story.");
    out1.println("The result will be written to an output file.");
    out1.println();
    madLibGame(out1, console);
  }

  public static void madLibGame(PrintStream out1, Scanner console) throws FileNotFoundException {
    String choice1="null"; //sets the initial value of the string to be "null" to execute the while loop
    String choice=choice1;
    while (!choice.startsWith("q")) { //the condition that the user doesn't quit
      out1.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      choice1=console.nextLine();
      choice=choice1.toLowerCase(); //makes the choice case-insensitive
      if (choice.startsWith("c")) { //creates a mad-lib file
        creates(out1, console, inputName(out1, console));
      }
      if (choice.startsWith("v")){ //views a mad-lib file
        view(out1, console, inputName(out1, console));
      }
    }
  }

  public static File inputName(PrintStream out1, Scanner console) { //the method that prompts the user for input file name and returns the file
    out1.print("Input file name: "); //prompts the user to enter the input file name
    String inputFileName=console.nextLine();
    File inputFile=new File(inputFileName); //accesses the file with that name
    while (!inputFile.exists()) { //executes the while loop if the file doesn't exist
      out1.print("File not found. Try again: ");
      inputFileName=console.nextLine();
      inputFile=new File(inputFileName);
     }
    return inputFile;
  }

  public static void creates(PrintStream out1, Scanner console, File inputFile) throws FileNotFoundException {
    Scanner input=new Scanner (inputFile); //creates a scanner that scans the input file
    out1.print("Output file name: ");  //prompts the user to enter the output file name
    String outputFileName=console.nextLine();
    File outputFile=new File(outputFileName); //creates a new file
    PrintStream out=new PrintStream(outputFile); //creates a PrintStream that prints onto the output file
    out1.println();
    replace(input, out, out1, console); //calls for the method that replaces placeholders with user input
    out1.println("Your mad-lib has been created!");
    out1.println();
  }

  public static void replace (Scanner input, PrintStream out, PrintStream out1, Scanner console) throws FileNotFoundException {
    while(input.hasNextLine()) {
      String line=input.nextLine(); //creates a string that stores the next line
      Scanner lineScan=new Scanner(line); //creates a scanner that scans each line
      while (lineScan.hasNext()) {
        String words;
        String placeholders;
        String placeholders1;
        String token=lineScan.next();
        if (token.startsWith("<") && token.endsWith(">") && token.length()>2){ //the condition that there is a placeholder
          placeholders=token.substring(1,token.length()-1); //gets rid of the < and > symbols
          placeholders=placeholders.replace("-", " "); //replaces the '-' symbol with a space
          placeholders1=placeholders.toLowerCase(); //the string that makes the placeholder case-insensitive
          if (placeholders1.charAt(0)=='a'||placeholders1.charAt(0)=='e'||placeholders1.charAt(0)=='i'||placeholders1.charAt(0)=='o'||placeholders1.charAt(0)=='u') {
            out1.print("Please type an "+placeholders+": ");
            words=console.nextLine();
            out.print(words+" "); //prints the word onto the output file
          } else {
            out1.print("Please type a "+placeholders+": ");
            words=console.nextLine();
            out.print(words+" ");
          }
        }else { //the condition that there isn't a placeholder
          words=token;
          out.print(words+" ");
        }
       }
       out.print("\n"); //writes the output line by line
     }
   }

  public static void view (PrintStream out1, Scanner console, File inputFile) throws FileNotFoundException {
    Scanner input=new Scanner (inputFile);
    out1.println();
    while(input.hasNextLine()) { //prints the file line by line
      String line=input.nextLine();
      out1.println(line);
    }
    out1.println();
  }
 }
