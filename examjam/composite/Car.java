// package ca.utoronto.utm.examjam.composite;

/**
 * EXERCISE: Review the Visitor Design Pattern and modify the Odometer
 * so that there are Increment, Decrement and StringRep Visitors
 * https://www.oodesign.com/visitor-pattern.html
 */
public class Car {
	private AODigit odometer = new OEnd();

	public Car() {
		odometer = new ODigit(odometer);
		odometer = new ODigit(odometer);
		odometer = new ODigit(odometer);
	}
  public void go() {
    IncrementVisitor inc = new IncrementVisitor();
    DecrementVisitor dec = new DecrementVisitor();

    for(int i=0; i<1005; i++) {
      StringRepVisitor strVis = new StringRepVisitor();
      odometer.accept(strVis);
      System.out.println(strVis.getResult());

      odometer.accept(inc);
    }

    for(int i=0; i<10; i++) {
      StringRepVisitor strVis = new StringRepVisitor();
      odometer.accept(strVis);
      System.out.println(strVis.getResult());

      odometer.accept(dec);
    }
  }

  public String toString() {
    StringRepVisitor strVis = new StringRepVisitor();
    odometer.accept(strVis);
    return strVis.getResult();
  }

  public static void main(String[] args) {
    Car c = new Car();
    c.go();
  }
/*	
	public void go() {
		for(int i=0;i<1005;i++) {
			System.out.println(odometer.stringRep());
			odometer.increment();
		}
		for(int i=0;i<10;i++) {
			System.out.println(odometer.stringRep());
			odometer.decrement();
		}
	}
	public String toString() {
		return odometer.stringRep();
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.go();
	}
*/
}
