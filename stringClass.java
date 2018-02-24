//CS 552, HW #3, Francell Angeles
/*
* Notes about strings
*/

import java.util.*;
import java.lang.*;

public class StringClass {

    public static Scanner in = new Scanner(System.in);

    // Number of Characters in a string
    public static int numberOf( char c, String s ){
        int numChar = 0;
        for (int i=0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                numChar++;
            }
        }
        return numChar;
     }

    // Rotate String
    public static String rotateString (String s, int n) {
		if (n < 0) {
			return  s.substring(-n) + s.substring(0, -n);
		} else {
		return s.substring(n) + s.substring(0, n);
		}
	}

	// Digit Sequence
	public static boolean digitSequence( String s ) {
		String regex = "-?\\d+";
		if (s.matches(regex)) {
			return true;
			} else {
				return false;
			}
		}
		
    public static void main(String[] arg) {
        System.out.println(numberOf('s', "Sassafrass"));
        System.out.println(rotateString("Pineapple", 2));
        System.out.println(digitSequence("8920189"));
    }
}
public static void show(int[] a) {
    System.out.print("[" + a.length + "]:");
	for(int i = 0; i < a.length; i++) System.out.print((i==0 ? "  " : ", ") + a[i]);
	System.out.println();
}
public static void show(String[] a){
    System.out.print("[" + a.length + "]:");
	for(int i = 0; i < a.length; i++)System.out.print((i==0 ? "  " : ", ") +"\"" + a[i] + "\"");
	System.out.println();
}
} // class A
