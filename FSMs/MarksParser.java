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

public class MarksParser{
  private ArrayList<Receipt> receipts;

  public MarksParser(){
    this.receipts = new ArrayList<Receipt>();
  }

  public ArrayList<Receipt> getReciepts(){ return this.receipts; }

  public void parseReciepts() throws IOException{
    BufferedReader br = null;
    try {
      Pattern pStart = Pattern.compile("^===\\s+RECEIPT\\s+===$");
      Pattern pEnd = Pattern.compile("^===\\s+END\\s+===$");

      Pattern pStore = Pattern.compile("^Store:\\s+(.*)$");
      Pattern pDate = Pattern.compile("^Date:\\s+(\\d{4}-\\d{2}-\\d{2})$");
      // Want to capture the name of the item
      // Remember: to recognize "." => "\\.". 
      Pattern pItem = Pattern.compile("^Item:\\s+(.*)\\s+-\\s+\\d+\\.\\d{2}$");
      Pattern pTotal = Pattern.compile("^Total:\\s+(\\d+\\.\\d{2})$");

      br = new BufferedReader(new FileReader("receipts.txt"));
      /*
       * Pattern p = Pattern.compile();
       * Matcher m = p.matcher("");
       * System.out.println(m.matches());
       */
      int state = 0;
      Matcher m;
      String line;
      Receipt receipt = null;
      while ((line = br.readLine()) != null) {
        // System.out.println(line);
        switch(state){
          case 0:
            m = pStart.matcher(line);
            if (m.matches()){
              receipt = new Receipt();
              state = 1;
            } else {
              System.out.println("Error. Expected start of reciept");
              return;
            }
            break;
          case 1:
            m = pStore.matcher(line);
            if (m.matches()){
              receipt.setStore(m.group(1));
              state = 2;
            } else {
              System.out.println("Error. Expected Store");
              return;
            }
            break;
          case 2:
            m = pDate.matcher(line);
            if (m.matches()){
              receipt.setDate(line);
              state = 3;
            } else {
              System.out.println("Error. Expected Date");
              return;
            }
            break;
          case 3:
            m = pItem.matcher(line);
            if (m.matches()){
              receipt.addItem(m.group(1));
              state = 3;
              break;
            } else {
              state = 4;
            }
          case 4:
            m = pTotal.matcher(line);
            if (m.matches()){
              double total = Double.parseDouble(m.group(1));
              receipt.setTotal(total);
              state = 5;
            } else {
              System.out.println("Error. Expected Total");
              return;
            }
            break;
          case 5:
            m = pEnd.matcher(line);
            if (m.matches()){
              this.receipts.add(receipt);
              state = 0;
            } else {
              System.out.println("Error. Expected End of Receipt");
              return;
            }
            break;
        }
      }
    } finally {
      if (br != null){
        br.close();
      }
    }
  }

  public static void main(String[] args){
    MarksParser parser = new MarksParser();
    try {
      parser.parseReciepts();
    } catch (IOException e){
      e.printStackTrace();
    }
    for (Receipt r : parser.getReciepts()){
      System.out.println(r);
    }
  }
}


