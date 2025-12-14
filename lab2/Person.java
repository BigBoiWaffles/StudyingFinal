
/**
 * Capture a person who can drink soda. A person can sip or gulp from a can of soda. The person knows how much soda they have consumed and know how thirsty they are
 */
public class Person{
	private String name;
	private int amountDrank = 0;

	/**
	 * Construct a new Person with the given name. So far they will have drank 0 soda.
	 * @param name - the name given to this person
	 */
	public Person(String name){
		this.name = name;
	}

	/**
	 * Takes a sip from the sodacan, s.
	 */
	public void sipFrom(SodaCan s){
		this.amountDrank = this.amountDrank + s.sip();
	}

	/**
	 * Takes a gulp from the sodacan, s.
	 */
	public void gulpFrom(SodaCan s){
		this.amountDrank = this.amountDrank + s.gulp();
	}

	/**
	 * A person is very thirsty if they drank less than 175.
	 * Thirsty if they drank less than 375.
	 * Satisfied if they drank at least 375.
	 */
	public String getThirstStatus(){
		if (this.amountDrank >= 0 && this.amountDrank < 175){ 
			return "very thirsty"; 
		} else if (this.amountDrank >= 175 && this.amountDrank < 375){
			return "thirsty";
		} else {
			return "satisfied";
		}
	}

	/**
	 * @return a string representation of this person
	 */
	public String toString(){
		return "I am " + this.name + " and I am " + this.getThirstStatus();
	}

}
