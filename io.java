import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class IO{
public static final Scanner in = new Scanner(System.in);
public static void main(String[] arg) throws FileNotFoundException,
IOException{
	System.out.print("name of input file: ");
	String inName = in.nextLine();
	Scanner fin = new Scanner(new BufferedReader(new FileReader(        // FileNotFoundException
	inName)));
System.out.print("name of output file: ");
String outName = in.nextLine();
PrintWriter fout = new PrintWriter(
		   new BufferedWriter(
		   new FileWriter(    // IOException, destructive
		   outName)));

while(fin.hasNextLine()){
	String line = fin.nextLine();
	Random r = new Random();
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    for (int i = 0; i < line.length(); i++) {

			fout.print(alphabet.charAt(r.nextInt(line.length())));
        }
}

fout.close();
fin.close();
 } // main
} // class IO
