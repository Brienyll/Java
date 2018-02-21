//CS 552 Francell Angeles HW#1C
/*
Input, with prompt, 3 #’s, which might have fractional parts. Output, with, explanatory text, the largest.
An example run of your program might go as
	3 #’s:  1.1  3.3  2.2
	max is 3.3

*/
import java.util.*;
import java.lang.*;

public class Largest {
    static int num, largest = 0;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("3 #'s: ");
    //if (!in.hasNextInt()) die("bogus #");
    num = in.nextInt();
    for (int i=1; i <= 2; i++) {
		num = in.nextInt();
		if (num > largest) {
			largest = num;
			}
		}
    System.out.println("The Largest number is: " +largest);
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
