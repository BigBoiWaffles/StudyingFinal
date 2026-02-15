import java.util.regex.*;

public class Ex4{
  public static void main(String[] args){
    Pattern p = Pattern.compile(".*[aeiouAEIOU].*[aeiouAEIOU].*[aeiouAEIOU].*");
    Matcher m = p.matcher("alsdkfjaweflkj");

    System.out.println(m.matches());
  }
}
