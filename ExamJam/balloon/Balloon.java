package balloon;
public class Balloon {

    private static int numCreated = 0; // total number of Balloons ever created
    public static int getNumCreated() { return numCreated; }

    private int amount;      // 0<=amount
    private int capacity;    // 0<=amount<=capacity
    private boolean isPopped; // balloons can only be popped once and can never be unpopped
    // if popped then capacity and amount should be 0

    // EXERCISE: constructor code is long, fix it!
    // EXERCISE: add a way to capture the number of balloons popped
    // EXERCISE: Balloons should have a colour, defaults to "red",
    // allow the user to supply a colour for a new Balloon
    public Balloon() {
        this.capacity = 100;
        this.amount = 0;
        this.isPopped = false;
        numCreated += 1;
    }

    public Balloon(int cap) {
        if(cap<0) {
            cap=0;
        }
        this.capacity = cap;
        this.amount = 0;
        this.isPopped = false;
        numCreated += 1;
    }

    public int getAmount() {
        return this.amount;
    }
    public int getCapacity() {
        return this.capacity;
    }

    public boolean getIsPopped() {
        return this.isPopped;
    }

    /**
     * EXERCISE: Understand this code and write the javadoc for it
     * @param amount
     */
    public void inflate(int amount) {
        if (this.isPopped) { return; }
        this.amount = this.amount + amount;
        if (this.amount > this.capacity) {
            // EXERCISE: create a pop method and call it here
            // only a balloon can call the pop method
        }
        if(this.amount<0)this.amount=0;
    }

    // EXERCISE: Write a toString() method, overriding the toString() in Object

    public static void main(String[] args) {
        // EXERCISE: Create various Balloons, inflate them till they pop
        // EXERCISE: Create an array of 10 balloons, with capacity 0 to 90
        // EXERCISE: Create a method that inflates an array of balloons by the specified amount
        // EXERCISE: use your new method on the array of balloons
        // EXERCISE: Redo the above three so that it works for an ArrayList
    }
}
