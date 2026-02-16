public class DecrementVisitor implements Visitor{

  @Override
  public void visit(ODigit o){
    int newDigit = o.getDigit() - 1;
    o.setDigit(newDigit);
    if (o.getDigit() == -1){
      o.setDigit(9);
      o.getNext().accept(this);
    }
  }

  @Override 
  public void visit(OEnd e){
    return;
  }
}
