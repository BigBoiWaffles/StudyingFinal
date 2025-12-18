package composite;

public class DecrementVisitor implements Visitor{
    @Override
    public void visit(ODigit oDigit){
        int decrease = oDigit.getDigit() - 1;
        if (decrease == -1){
            oDigit.setDigit(9);
            oDigit.getNext().accept(this);
        } else {
            oDigit.setDigit(decrease);
        }
    }

    @Override
    public void visit(OEnd oEnd){
        return;
    }
}
