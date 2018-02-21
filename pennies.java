//CS 552 Francell Angeles HW#1F
/*
Input, with prompt, the number of cents a vending machine is to dispense. Output the number of quarters, dimes, nickels, and pennies necessary to get that amount of money using the smallest number of coins possible.
An example run of your program might go as
	cents: 67
	2 quarters
	1 dimes
	1 nickels
	2 pennies
*/
import java.util.*;
import java.lang.*;

public class Pennies {
    static int cents, quarters, dimes, nickels, pennies;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("Cents: ");
    if (!in.hasNextInt()) die("bogus #");
    cents = in.nextInt();
    quarters = cents / 25;
    dimes = (cents % 25) / 10;
    nickels = ((cents % 25) % 10) / 5;
    pennies = (((cents % 25) % 10) % 5) / 1;
    System.out.println(quarters + " quarters\n" +dimes+ " dimes\n" +nickels+ " nickels\n" +pennies+ " pennies");
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
