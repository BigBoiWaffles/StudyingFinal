// package ca.utoronto.utm.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class RegExIntro {
	// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/regex/package-summary.html

        public static void main(String[] args) throws IOException {
            String ccNumber = "\\d{16}";

            System.out.println(Pattern.matches(ccNumber, "2856732048135983"));
            System.out.println(Pattern.matches(ccNumber, "28567320481359832dfg3454345xt6y"));

            String rgPostal = "[a-zA-Z]\\d[a-zA-Z]\\s?\\d[a-zA-Z]\\d";
            System.out.println(Pattern.matches(rgPostal, "L5L 1C6"));
            System.out.println(Pattern.matches(rgPostal, "l5l 1C6"));
            System.out.println(Pattern.matches(rgPostal, "L5L1c6"));

            String rgMarks = "(.*),(\\d{9,10}),((100)|([1-9]?\\d))";
            Pattern p = Pattern.compile(rgMarks);
            Matcher m;

            BufferedReader br = new BufferedReader(new FileReader("./regex/marks.csv"));
            String line;
            while(true){
                line = br.readLine();
                if(line == null) break;
                m = p.matcher(line);
                if (m.matches()){
                    //m.group(0) is the entire string
                    //m.group(1) is the first group...so on and so forth
                    System.out.println("Student: " + m.group(1));
                    System.out.println("Grade: " + m.group(3));
                }
            }

        }
}

