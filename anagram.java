import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class file1{
public static final Scanner in = new Scanner(System.in);
public static void main(String[] arg) throws FileNotFoundException,
IOException{
	System.out.print("name of input file: ");
	String inName = in.nextLine();
	BufferedReader fin = new BufferedReader(new FileReader(        // FileNotFoundException
	inName));
System.out.print("name of output file: ");
String outName = in.nextLine();
PrintWriter fout = new PrintWriter(new BufferedWriter(
		   new FileWriter(    // IOException, destructive
		   outName)));

String line = null;

while((line = fin.readLine()) != null ){
	if (line.length() != inName.length()) {
	fout.println(line);
}
}
	fout.close();
	fin.close();
	 } // main
}
