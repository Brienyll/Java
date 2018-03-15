import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.regex.*;

public class IO{
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] arg) throws FileNotFoundException,IOException {
		System.out.print("name of input file: ");
		String inName = in.nextLine();
		Scanner fin = new Scanner(new BufferedReader(new FileReader(inName)));

	System.out.print("name of output file: ");
	String outName = in.nextLine();
	PrintWriter fout = new PrintWriter(
			   new BufferedWriter(
			   new FileWriter(outName)));


	while(fin.hasNextLine()){
		String rex = "[a-z]+";
		Pattern pattern = Pattern.compile(rex);
		String contentLine = fin.nextLine();
		if (contentLine.matches(rex)) {
			System.out.println("Bogus");
			}

		fout.println(contentLine);
		}
	fout.close();
	fin.close();
	 } // main
} // class IO
