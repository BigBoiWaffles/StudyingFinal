import java.util.regex.*;

public class Ex2 {
  public static void main(String[] args){
    Pattern p = Pattern.compile("^\\w{5,}$");
    Matcher m = p.matcher("laskdfjla");

    System.out.println(m.matches());
  }
}
