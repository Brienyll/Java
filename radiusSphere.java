//CS 552 Francell Angeles HW#1B
/*Input, with a prompt, the radius of a sphere. Output, with explanatory text, the volume.
According to my geometry book,,V=4/3pi3Rcube Where  V  is  the  area,  R  is  the  radius,  and is
3.14159265358979323846.  An  example  run  of  your  program might go
Radius: 2.5Volume is 65.44984694978736
*/
import java.util.*;
import java.lang.*;

public class Radius {
    static double radius, volume;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("Radius: ");
    //if (!in.hasNextDouble()) die("bogus #");
    radius = in.nextDouble();
    if(radius < 0) die("negative radius??");
    volume =  (4.0/3.0)*Math.PI*(Math.pow(radius,3));
    System.out.println("Volume is: " +volume);
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
