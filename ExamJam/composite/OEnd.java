package composite;

public class OEnd implements AODigit {
    @Override
    public void accept(Visitor v){
        v.visit(this);
    }

}
