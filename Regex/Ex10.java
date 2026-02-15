import java.util.regex.*;

public class Ex10 {
  public static void main(String[] args){
    Pattern p = Pattern.compile("^(0[1-9]|1[0-2]):(0[0-9]|[1-5][0-9]):(0[0-9]|[1-5][0-9])$");
    Matcher m = p.matcher("11:00:39");

    System.out.println(m.matches());
  }
}
