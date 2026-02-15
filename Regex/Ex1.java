import java.util.regex.*;

public class Ex1{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^\\d+$");

    Matcher m = p.matcher("1234567");
    System.out.println(m.matches());
  }
}
