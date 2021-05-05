/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 05 Sep 2016
 * PA 1 - This program produces a seven-verse nursery rhyme as output. 
 * Bugs: None
 */
 
public class ThisHouse {
    public static void main (String[] args) {
        thisJack(); //prints the first verse and a blank statement
        thisMalt(); //prints the second verse and a blank statement
        thisRat(); //prints the third verse and a blank statement
        thisCat(); //prints the forth verse and a blank statement
        thisDog(); //prints the fifth verse and a blank statement
        thisCow(); //prints the sixth verse and a blank statement
        thisMaiden(); //prints the seventh verse and a blank statement
    }
    
    public static void thisJack() { //prints the first verse and a blank statement
        System.out.println("This is the house that Jack built.");
        System.out.println();
    }
    
    public static void thisMalt() { //prints the second verse and a blank statement
        System.out.println("This is the malt");
        jack(); //prints a repeated line in the rhyme 
    }
    
    public static void jack() { 
        System.out.println("That lay in the house that Jack built."); 
        System.out.println(); 
    }
    
    public static void thisRat() { //prints the third verse and a blank statement
        System.out.println("This is the rat,");
        rat(); //prints two lines repeated in the rhyme 
    }
    
    public static void rat() { 
        System.out.println("That ate the malt");
        jack(); 
    }
    
    public static void thisCat() { //prints the forth verse and a blank statement
        System.out.println("This is the cat,");
        cat(); //prints three lines repeated in the rhyme
    }
        
    public static void cat() { 
        System.out.println("That killed the rat,");
        rat();
    }
    
    public static void thisDog() { //prints the fifth verse and a blank statement
        System.out.println("This is the dog,");
        dog(); //prints four lines repeated in the rhyme
    }
    
    public static void dog() { 
        System.out.println("That worried the cat,");
        cat();
    }
    
    public static void thisCow() { //prints the sixth verse and a blank statement
        System.out.println("This is the cow with the crumpled horn,");
        cow(); //prints five lines repeated in the rhyme
    }
    
    public static void cow() { 
        System.out.println("That tossed the dog,");
        dog();
    }
    
    public static void thisMaiden() { //prints the seventh verse and a blank statement
        System.out.println("This is the maiden all forlorn");
        maiden(); //prints six lines repeated in the rhyme
    }
    
    public static void maiden() { 
        System.out.println("That milked the cow with the crumpled horn,");
        cow();
    }
}
















