//CS 552 Francell Angeles HW#1C
/*
Input, with prompt, the base and height of a triangle (might be fractional).
Output the area of the triangle. According to my geometry book, A = B*H / 2
where A is area, B is base, and H is height. An example run of your program might go as
Base: 2.2  	Height: 5 Area is 5.5

*/
import java.util.*;
import java.lang.*;

public class Area {
    static double base, height, area;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("Base: ");
    //if (!in.hasNextInt()) die("bogus #");
    base = in.nextDouble();
    System.out.print("Base: ");
    height = in.nextDouble();

    area = ((base * height) / 2) ;
    System.out.println("The Area is: " +area);
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
