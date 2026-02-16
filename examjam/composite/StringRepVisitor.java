//import java.util.StringBuilder;

public class StringRepVisitor implements Visitor{
  private StringBuilder result = new StringBuilder();
  @Override
  public void visit(ODigit o){
    o.getNext().accept(this);
    result.append(o.getDigit());
  }

  @Override 
  public void visit(OEnd e){
  }

  public String getResult(){
    return result.toString();
  }
}
