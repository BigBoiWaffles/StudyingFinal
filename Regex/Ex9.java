import java.util.regex.*;

public class Ex9 {
  public static void main(String[] args){
    Pattern p = Pattern.compile("^.*\\b(\\w+)\\b.*\\b\\1\\b.*$");
    Matcher m = p.matcher("alsdkfja Hello asldkjfasdlkjf Hello alsdjff");

    System.out.println(m.matches());
  }
}
