import java.util.regex.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
  public static void main(String[] args){
    Pattern p = Pattern.compile("^(0[1-9]|1[0-2]):(0[0-9]|[1-5][0-9]):(0[0-9]|[1-5][0-9])$");
    Scanner sc = new Scanner(System.in);
    String s;
    while (true){
      System.out.println("String to compare: ");
      s = sc.nextLine();
      if (s == "") { break; }
      else{
        Matcher m = p.matcher(s);
        System.out.println(s);
        System.out.println(m.matches());
      }
    }
  }
}
