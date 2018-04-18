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

public class Main {
  public static void main(String[] arg){
    double ret[] = stats(new double[]{0, -1, -2, 0, 3, 2, 4, 0});
    System.out.println("neg ave: " + ret[0]);
    System.out.println("neg max: " + ret[1]);
    System.out.println("pos min: " + ret[2]);
    System.out.println("pos ave: " + ret[3]);
  } // main
  public static double[] stats( double[] ar){
    double[] ret = new double[4];
    double maxNeg = 0, minPos = 0;// #'s closest to 0 on either side
    int countNeg = 0, countPos = 0; // # of negative & positive #'s
    double sumNeg = 0, sumPos = 0; // sum of neg's & pos's
    for(double x: ar)if(x > 0){ 
      if(countPos == 0 || minPos > x)minPos = x;
      countPos++;
      sumPos += x;
    }else if(x < 0){if(countNeg == 0 || maxNeg < x)maxNeg = x;
    countNeg++;
    sumNeg += x;
    }
    return new double[]{sumNeg/countNeg,maxNeg, minPos,sumPos/countPos};
  } // stats}
}
