/**
 * Capture a can of soda. 
 * A can of soda has a type, amount (initially 250) and is initially closed.
 * Once opened, you can sip (take at most 10) or gulp (take at most 50) from the can
 * At all times, the amount of soda in the can is between 0 and 250.
 * An opened can can not be closed
 */
public class SodaCan{
	// Type of Soda
	private String type;
	// Initial amount
	private int amount = 250;
	// Can is originially closed
	private boolean isOpened = false;
	
	/**
	 * Constructs a new SodaCan
	 * @param type - the type of soda, for example "RootBeer", "Coke", "Cherry"
	 */
	public SodaCan(String type){
		this.type = type;
	}

	/**
	 * Open this SodaCan
	 */ 
	public void open(){
		this.isOpened = true;
	}

	/**
	 * Checks whether this is open
	 * @return if this SodaCan is opened or not
	 */ 
	public boolean isOpen(){
		return this.isOpened;
	}

	/**
	 * Remove 10cc from this sodacan, given that the can is open
	 * @return the amount of soda actually removed
	 */
	public int sip(){
		if (!this.isOpen()){
			return 0;
		}
		int amount_drank = this.amount - 10;
		this.amount = this.amount - 10;
		if (amount_drank < 0){
			amount_drank = amount_drank + 10;
			this.amount = 0;
			return amount_drank;
		}
		return amount_drank;
	}

	/**
	 * Remove 50cc from this sodacan, thiven that the can is open
	 * @return the amount of soda actually removed
	 */
	public int gulp(){
		if(!this.isOpen()){
			return 0;
		}
		int amount_drank = this.amount - 50;
		this.amount = this.amount - 50;
		if (amount_drank < 0){
			amount_drank = amount_drank + 50;
			this.amount = 0;
			return amount_drank;
		}
		return amount_drank;
	}

	/**
	 * @return the amount of soda currently in this can
	 */
	public int getAmount(){
		return this.amount;
	}

	/**
	 * @return the string representation of this sodacan
	 */
	public String toString(){
		if (this.isOpen()){
			return this.type + " open " + this.amount;
		} else {
			return this.type + " closed " + this.amount;
		}
	}
}
