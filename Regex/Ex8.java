import java.util.regex.*;

public class Ex8{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^[A-Z](\\d)[A-Z] \\1[A-Z]\\1$");
    Matcher m = p.matcher("M5R 5E5");

    System.out.println(m.matches());
  }
}
