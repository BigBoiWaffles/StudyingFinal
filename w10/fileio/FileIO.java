// package ca.utoronto.utm.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void consoleIO() {
		// System class System.in, System.out
		// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/System.html
		char[] c = new char[10];

		try {
      // Reads 1 byte at a time. Stores only 10 bytes.
      // If given "hello[enter]" it still waits for 4 more characters to fill 
      // up the 10 byte size.
			for (int i = 0; i < c.length; i++) {
				c[i] = (char) System.in.read(); // System.in is an InputStream
			}
		} catch (IOException e) {
			System.out.println(e);
		}
    
    // Prints out all the stored bytes in c.
    // Remember, it only stored 10 bytes thus given "Hello World[enter]"
    // It will output
    //  H 
    //  e 
    //  l 
    //  l 
    //  o 
    //   
    //  W 
    //  o 
    //  r 
    //   
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
    // Outputs a new line
		System.out.println();
    
    // After Storing 10 char in c, it moves to a second way/strategy immediately.
		// Would prefer to read a line at a time...
    /* 
		BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = lineInput.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
    */

		// Alternatively, can use a scanner
		Scanner sc = new Scanner(System.in);
    String line;
    while ((line = sc.nextLine()) != null){
      System.out.println(line);
    }
 }

	public static void fileReading() {
		// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/package-summary.html
		// https://javarevisited.blogspot.com/2014/04/difference-between-fileinputstream-and-filereader-in-java.html
		//
    		// InputStream - Abstract class is the superclass of all classes representing an input stream of bytes.
		// Reader - Abstract class for reading character streams
		// BufferedReader - Reading line oriented data
		//
		// read words and count the number of lines in the file
		try {
			// FileReader is used to read text (not binary data), so some encoding is done 
			// to convert from the binary data in the file to characters in Strings in Java.
			FileReader fr = new FileReader("words"); 

			// Buffered to make reading more efficient
			BufferedReader lineInput = new BufferedReader(fr);
			String line;
			int count=0;
			// while ((line = lineInput.readLine()) != null) {
			while(true) {
				line = lineInput.readLine();
				
        if (line == null) { 
          break;
        }
				
				// System.out.println(line);
				count++;
			}
			System.out.println(count);
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1){
			System.out.println(e1);
		} 
		// read words and print them all out
	}
	public static void fileWriting() {
		// https://www.journaldev.com/878/java-write-to-file
		try {
			
			// Could use a PrintWriter as well...
			FileWriter fw = new FileWriter("stuff");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hi There\n");
			bw.write("Something\n");
			bw.close();
			
			// Could use a PrintWriter as well...
			PrintWriter pw = new PrintWriter("somethingAwesome");

			pw.print("That is a string");
			pw.println("This is a string");
			pw.println("This is a string");
			pw.println("This is a string");

			pw.close();
			
			pw = new PrintWriter(new FileWriter("somethingAwesome", true)); // for append
			pw.println("Some More!!");
			pw.println("Some More!!");
			pw.close();


			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// consoleIO();
		// fileReading();
		fileWriting();
	}
}
