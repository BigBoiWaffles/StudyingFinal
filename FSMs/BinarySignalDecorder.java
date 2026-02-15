import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class BinarySignalDecorder{
  private String s;

  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    try {
      while ((line = br.readLine()) != null){
        if (decode(line)){
          System.out.println("Accepted the string: " + line);
        } else {
          System.out.println("Declined the string: " + line);
        }
      }
    } catch (IOException e){
      e.printStackTrace();
    } 
  }

  public static boolean decode(String line){
    char[] c = line.toCharArray();

    int n = 0;
    int state = 0;

    while(n < line.length()){
      switch (state){
        case 0:
          if (c[n] == '#'){
            state = 1;
          } else {
            state = 2;
          }
          break;
        case 1:
          if (c[n] == '1' || c[n] == '0'){
            state = 1;
          } else if (c[n] == ';'){
            state = 3;
          } else {
            state = 2;
          }
          break;
        case 3:
          state = 2;
          break;
        case 2:
          break;
      }
      n = n + 1;
    }
    if (state == 2){
      return false;
    }
    return state == 3;
  }
}
