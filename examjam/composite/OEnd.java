// package ca.utoronto.utm.examjam.composite;

public class OEnd implements AODigit {
/*
	@Override
	public void increment() {
		return;
	}

	@Override
	public String stringRep() {
		return "";
	}

	@Override
	public void decrement() {
		return;
	}
*/
  @Override
  public void accept(Visitor v){
    v.visit(this);
  }
}
