public class Balloon{
	private int amount = 0;
	private int capacity = 0;
	private boolean isPopped = false;

	public Balloon(){
		this.capacity = 10;
	}

	public void inflate(int amount){
		if (this.isPopped){
			return;
		}

		this.amount = this.amount + amount;
		if (this.amount > this.capacity){
			this.isPopped = true;
			this.amount = 0;
			this.capacity = 0;
		}
	}

	public String toString(){
		String s = "";
		s = s + " amount = " + this.amount;
		s = s + " capacity = " + this.capacity;
		s = s + " isPopped = " + this.isPopped;
		return s;
	}
}
