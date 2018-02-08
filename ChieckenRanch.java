//CS 552 Francell Angeles HW#1A
/*Input, with a prompt, the number of eggs laid at our chicken ranch. Output, with explanatory text,
the number of egg cartons needed. Assume an egg carton holds 12 eggs. If the number of eggs is not a multiple of 12,
then  the  last  egg  carton  will  only  be  partially  filled.  An  example  run  of  your  program  (with  the  input  in boldface)
might go asEggs: 1009 cartons(In  this  case,  the  first  8  cartons  are  filled,  and  the  ninth  carton  holds  the  remaining  4  eggs.)
The  number  of eggs  and  the  number  of  cartons  are  both  always  integers.  Your  program  only  has  to  handle  one  number,
no looping required.
*/
import java.util.*;

public class ChickenRanch {
    static int numOfCartons, eggsRemaining;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] arg) {
    System.out.print("Eggs: ");
    if (!in.hasNextInt()) die("bogus #");
    int numOfEggs = in.nextInt();
    if(numOfEggs < 0) die("negative area ???");
    numOfCartons = numOfEggs / 12;
    eggsRemaining = numOfEggs % 12;
    System.out.println(numOfCartons + " cartons and " +eggsRemaining+ " eggs remaining");
    }

     public static void die(String msg) {
            System.out.println("Fatal error: " + msg);
            System.exit(1);
    }
}
