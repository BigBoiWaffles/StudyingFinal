import java.util.ArrayList;

public class Receipt {
  private String store;
  private String date;
  private ArrayList<String> items;
  private double total;

  public Receipt(){
    this.items = new ArrayList<String>();
  }

  public void setStore(String store){ this.store = store; }
  public void setDate(String date){ this.date = date; }
  public void addItem(String item){ this.items.add(item); }
  public void setTotal(double total){ this.total = total; }

  public String toString(){
    return "Receipt from " + this.store + " on " + date + " (" + items.size() + " items) | Total: $" + total;
  }
}
