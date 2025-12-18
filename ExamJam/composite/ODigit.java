package composite;

public class ODigit implements AODigit {
	private AODigit next;
	private int digit;
	
	public ODigit(AODigit next) {
		this.next=next;
		this.digit=0;
	}

    @Override
    public void accept(Visitor v){
        v.visit(this);
    }

    public int getDigit(){ return this.digit; }
    public void setDigit(int digit){ this.digit = digit; }
    public AODigit getNext(){ return this.next; }
}
