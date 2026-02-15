import java.util.regex.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7{
  public static void main(String[] args){
    try {
      Pattern p = Pattern.compile("^[ABCEGHJKLMNPRSTVXY]\\d[ABCEGHJKLMNPRSTVXY] \\d[ABCEGHJKLMNPRSTVXY]\\d$");
      BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));

      while (true){
        System.out.println("String to compare: ");
        String s = lineInput.readLine();
        if (s == "") { break; }
        else {
          Matcher m = p.matcher(s);
          System.out.println(m.matches());
        }
      }
    } catch (Exception e){}
  } 
}
