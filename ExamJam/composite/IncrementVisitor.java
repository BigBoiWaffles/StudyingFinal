package composite;

public class IncrementVisitor implements Visitor{
    @Override
    public void visit(ODigit oDigit){
        int increase = oDigit.getDigit() + 1;
        if (increase == 10){
            oDigit.setDigit(0);
            oDigit.getNext().accept(this);
        } else {
            oDigit.setDigit(increase);
        }
    }

    @Override
    public void visit(OEnd oEnd){
        return;
    }
}
