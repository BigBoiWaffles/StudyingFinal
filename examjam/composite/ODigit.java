// package ca.utoronto.utm.examjam.composite;

public class ODigit implements AODigit {
	private AODigit next;
	private int digit;
	
	public ODigit(AODigit next) {
		this.next=next;
		this.digit=0;
	}

  public AODigit getNext(){ return this.next; }
  public int getDigit(){ return this.digit; }
  public void setDigit(int n){ this.digit = n; }
/*
	@Override
	public void increment() {
		this.digit++;
		if(this.digit==10) {
			this.digit=0;
			this.next.increment();
		}
		
	}

	@Override
	public String stringRep() {
		return this.next.stringRep()+this.digit;
	}

	@Override
	public void decrement() {
		this.digit--;
		if(this.digit==-1){
			this.digit=9;
			this.next.decrement();
		}
	}
*/
  @Override
  public void accept(Visitor v){
    v.visit(this);
  }
}
