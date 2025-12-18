package composite;

/**
 * EXERCISE: Review the Visitor Design Pattern and modify the Odometer
 * so that there are Increment, Decrement and StringRep Visitors
 * https://www.oodesign.com/visitor-pattern.html
 */
public class Car {
	private AODigit odometer = new OEnd();
    private IncrementVisitor incrementVisitor;
    private DecrementVisitor decrementVisitor;
    private StringRepVisitor stringRepVisitor;

	public Car() {
		odometer = new ODigit(odometer);
		odometer = new ODigit(odometer);
		odometer = new ODigit(odometer);
        incrementVisitor = new IncrementVisitor();
        decrementVisitor = new DecrementVisitor();
        stringRepVisitor = new StringRepVisitor();
	}
	
	public void go() {

		for(int i=0;i<1005;i++) {
            stringRepVisitor = new StringRepVisitor();
            odometer.accept(stringRepVisitor);
			System.out.println(stringRepVisitor.getResult());

			odometer.accept(incrementVisitor);
		}
		for(int i=0;i<10;i++) {
            stringRepVisitor = new StringRepVisitor();
            odometer.accept(stringRepVisitor);
			System.out.println(stringRepVisitor.getResult());
			odometer.accept(decrementVisitor);
		}
	}
	public String toString() {
		StringRepVisitor visitor  = new StringRepVisitor();
        odometer.accept(visitor);
        return visitor.getResult();
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.go();
	}
}
