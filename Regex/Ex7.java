import java.util.regex.*;

public class Ex7{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^[ABCEGHJKLMNPRSTVXY]\\d[ABCEGHJKLMNPRSTVXY] \\d[ABCEGHJKLMNPRSTVXY]\\d$");
    Matcher m = p.matcher("M5R 1E4");

    System.out.println(m.matches());
  }
}
