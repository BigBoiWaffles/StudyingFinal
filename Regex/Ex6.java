import java.util.regex.*;

public class Ex6{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^[A-Z][a-zA-Z]*\\s+[A-Z][a-zA-Z]*$");
    Matcher m = p.matcher("Hello World");

    System.out.println(m.matches());
  }
}
