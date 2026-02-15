import java.util.regex.*;

public class Ex3{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$");
    Matcher m = p.matcher("123-456-7890");

    System.out.println(m.matches());
  }
}
