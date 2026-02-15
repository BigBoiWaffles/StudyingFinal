import java.util.regex.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ex5{
  public static void main(String[] args){
    try {
      Pattern p = Pattern.compile("^.*[a-z]{4}.*$");
      BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));

      while(true){
        System.out.println("String to compare: ");
        String s = lineInput.readLine();
        Matcher m = p.matcher(s);
        if (s == ""){
          break;
        } else {
          System.out.println(m.matches());
        }
      }
    } catch (Exception e){}
  }
}
