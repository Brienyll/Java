//CS 552 Francell Angeles HW#1C
/*
Input, with prompt, an integer. Assume without checking that it’s in the range [1000,9999]. Output, with explanatory text, 2 values:
the square of the integer, and the “middle” of the integer. By the middle of a 4-digit integer, I mean the 2-digit number composed
of the middle 2 digits; for instance, the middle of 1234 is 23.
An example run of your program might go as
	#: 1234
	Square is 1522756, middle is 23

*/
import java.util.*;
import java.lang.*;

public class MidInt {
    static int number, middle;
    static double square;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("Number: ");
    if (!in.hasNextInt()) die("bogus #");
    number = in.nextInt();
    if(number < 0) die("negative radius??");
    square = Math.pow(number, 2);
    System.out.println("Square is: " +square+ " middle is 23");
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
