// package ca.utoronto.utm.fileio;

import java.io.*;
import java.util.Scanner;

public class FileIO {

    public static void ByteStreamIO() throws IOException {

        char[] c = new char[10];
        int[] byteArray = new int[10];
        //Use the System.in InputStream to obtain one byte at a time from the console
        //note the return value of InputSteam.read() are int.

        //type thequickbrownfox into the console
        System.out.println("Enter 10 characters: ");
        for (int i = 0; i < c.length; i++) {
            byteArray[i] = System.in.read();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) byteArray[i];
        }


        System.out.println("What happens if we don't cast InputStream to char:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(byteArray[i]);
        }
        System.out.println();
        System.out.println("And if we do cast to char (assuming we know the input are chars):");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


        //Byte streams read raw byte data from files without casting them to any data type.
        String inputFilePath = "./fileio/Smiley_Face.JPG";
        String outFilePath = "./fileio/Smiley_Face_copy.JPG";

        FileInputStream fis = new FileInputStream(inputFilePath);
        FileOutputStream fos = new FileOutputStream(outFilePath);

        byte[] buffer = new byte[1024]; //pick some power of 2 for buffer size
        int bytesRead;

        //now let's read some bytes!
        // while (the number of bytes read from inputFile.read(desired number of bytes) > 0)...
        while ((bytesRead = fis.read(buffer)) != -1) {
            //do something with those bytes...in this case, just append them at the end of output file
            fos.write(buffer, 0, bytesRead);
        }
        fos.close();
        System.out.println("We just copied " + inputFilePath + "!");

    }

    public static void CharacterStreamIO() throws IOException {
        // Ok, so if we know our data is characters, instead of using a generic byte stream and
        //then cast to char, we can use a CharacterStream (which is char wrapper for Byte streams)

        InputStreamReader charStream = new InputStreamReader(System.in, "UTF-8");
        char[] c = new char[10];
        System.out.println("Enter more 10 characters: "); //type MoreCharacters! this time

        //note that the read method still returns an int (frustrating, I know!). So what's the difference?
        for (int i = 0; i < 10; i++) {
            c[i] = (char) charStream.read();
        }
        //Notice the "UTF-8" character set in the InputStreamReader constructor?
        //One byte of english characters is one character. But...one byte of, for example
        // chinese characters, is not one byte. So here you are asking for "one UTF-8 encoded
        // character, however long that may be.

        for (char value : c) {
            System.out.println(value);
        }
        //why did it not print the first 10 characters of "MoreCharacters!"?
        //Because there were unread characters left in System.in from when we typed "thequickbrownfox" from before.

        //Want a class that can easily read text without having to cast it, or worry about unread characters?

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);

    }

    public static void BufferedStreamIO() throws IOException {
        char[] c = new char[10];


        BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));

        //Ok, so reading in one byte at a time has it's uses, but is annoying. This
        // is why other types of streams exist.
        String line;
        System.out.println("Type anything. Exit by entering a blank line: ");
        while ((line = lineInput.readLine()) != null) {
            if (line.isEmpty()) {break;}
            System.out.println(line);
        }

    }

    public static void fileReading() throws IOException {

        // InputStream - Abstract class is the superclass of all classes representing an input stream of bytes.
        // Reader - Abstract class for reading character streams
        // BufferedReader - Reading line oriented data
        //
        // read words and count the number of lines in the file

        // FileReader is used to read text (not binary data), so some encoding is done
        // to convert from the binary data in the file to characters in Strings in Java.
        FileReader fr = new FileReader("./fileio/words");

        // Buffered to make reading more efficient
        BufferedReader lineInput = new BufferedReader(fr);
        String line;
        int count=0;
        // while ((line = lineInput.readLine()) != null) {
        while(true) {
            line = lineInput.readLine();
            if(line == null)break;

            // System.out.println(line);
            count++;
        }
        System.out.println(count);
        fr.close();

    }
    public static void fileWriting() {

        //We haven't formally covered try/catch structures, but all these should be wrapped in try/catch
        //instead of having the method throwing an error.
        try {

            // Could use a PrintWriter as well...
            FileWriter fw = new FileWriter("./filrio/stuff");
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

    public static void main(String[] args) throws IOException {
        //ByteStreamIO();
        //CharacterStreamIO();
        //BufferedStreamIO();
        //fileReading();
        //fileWriting();
    }
}
