// package ca.utoronto.utm.regex;

import java.util.regex.*;

public class RegExIntro {
	// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/regex/package-summary.html

        public static void main(String[] args) {

                Pattern p = Pattern.compile("(cb)+"); // this takes the regex
                Matcher m = p.matcher("ccc"); // this takes the string
                System.out.println(m.matches()); // checks entire string

                // same as:
                System.out.println(Pattern.matches("(cb)+", "ccc")); // this is automatically ^(cb)+$

                // To check if pattern occurs in any part of the string, use find:
                Matcher m2 = p.matcher("zzcbcbcbcc");
                System.out.println(m2.matches());
                System.out.println(m2.find());

        }
}

