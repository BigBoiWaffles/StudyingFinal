package composite;

public class StringRepVisitor implements Visitor{
    private String result;
    @Override
    public void visit(ODigit oDigit){
        oDigit.getNext().accept(this);
        this.result += oDigit.getDigit();
    }

    @Override
    public void visit(OEnd oEnd){
        this.result = "";
    }

    public String getResult(){
        return this.result;
    }
}
