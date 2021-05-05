/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 30 Sep 2016
 * PA 3 - This program inputs the name, quantity, and price of three items and outputs
   a bill with a tax rate of 6.25%. 
 * Bugs: None
 */ 
 
import java.util.*; 
 
public class Problem4 {
  public static void main (String[] args) {
    int one1=1; 
    
    String name1=name(one1); 
    int quantity1=quantity(one1);
    double price1=price(one1); 
    
    String name2=name(one1+1);
    int quantity2=quantity(one1+1);
    double price2=price(one1+1); 
    
    String name3=name(one1+2);
    int quantity3=quantity(one1+2);
    double price3=price(one1+2);  
    
    double total1=total(quantity1, price1); 
    double total2=total(quantity2, price2);
    double total3=total(quantity3, price3);
    
    System.out.println("Your bill:");
    System.out.printf("%-30s","Item");
    System.out.printf("%-10s","Quantity");
    System.out.printf("%-10s","Price");
    System.out.printf("%-10s\n","Total");
    
    characters(name1, quantity1, price1, total1); 
    characters(name2, quantity2, price2, total2); 
    characters(name3, quantity3, price3, total3); 
    
    tax(total1, total2, total3); //prints the subtotal, tax and total of all three items 
  }
  
  public static String name(int number) { //prompts users for the name of an item 
    System.out.println("Input name of item "+number+":");
    Scanner console=new Scanner (System.in); 
    String name=console.next(); 
    return name; 
  }
  
  public static int quantity(int number) { //prompts users for the quantity of an item 
    System.out.println("Input quantity of item "+number+":");
    Scanner console=new Scanner (System.in); 
    int quantity=console.nextInt(); 
    return quantity; 
  }
  
  public static double price(int number) { //promps users for the price of an item 
    System.out.println("Input price of item "+number+":");
    Scanner console=new Scanner (System.in); 
    double price=console.nextDouble(); 
    return price; 
  }
  
  public static double total(int quantity, double price) {
    double total=price*quantity; //calculates the total price of the item
    return total; 
  }
  
  public static void characters(String name,int x, double y, double z) { 
    System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",name,x,y,z); //formats name of item with 30 characters and quantity, price and total with 10 characters
  }
  
  public static void tax(double total1, double total2, double total3) {
    System.out.println();
    System.out.print("Subtotal");
    double subtotal=total1+total2+total3; //calculates the subtotal of all three items 
    System.out.printf("%47.2f\n",subtotal); //rounds subtotal to 2 decimal places and makes it align to the right 
    System.out.print("6.25% sales tax");
    double tax=subtotal*0.0625;  //calculates the tax of all three items 
    System.out.printf("%40.2f\n",tax); //rounds tax to 2 decimal places and makes it align to the right
    System.out.print("Total");
    double total=subtotal+tax; //calculates the sum of subtotal and tax 
    System.out.printf("%50.2f\n",total); //rounds the total to 2 decimal places and makes it align to the right
  }
}