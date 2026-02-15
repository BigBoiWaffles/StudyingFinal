import java.util.regex.*;

public class Ex5{
  public static void main(String[] args){
    Pattern p = Pattern.compile("^.*[a-z]{4}.*$");
    Matcher m = p.matcher("LASKJdKLlkjALKSJdALKSDksfaLKJASD");

    System.out.println(m.matches());
  }
}
