// package ca.utoronto.utm.examjam.composite;

public interface AODigit {
//	public void increment();
//	public String stringRep();
//	public void decrement();
  public void accept(Visitor v);
}
