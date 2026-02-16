public class IncrementVisitor implements Visitor{

  @Override
  public void visit(ODigit o){
    int new_digit = o.getDigit() + 1;
    o.setDigit(new_digit);
    if (o.getDigit() == 10){
      o.setDigit(0);
      o.getNext().accept(this);
    }
  }

  @Override 
  public void visit(OEnd e){
    return;
  }
}
