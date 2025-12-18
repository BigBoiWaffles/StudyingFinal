package balloon;
public class Balloon {

    private static int numCreated = 0;// total number of Balloons ever created
    private static int numPopped = 0;
    public static int getNumCreated() { return numCreated; }

    private String colour;
    private int amount;      // 0<=amount
    private int capacity;    // 0<=amount<=capacity
    private boolean isPopped; // balloons can only be popped once and can never be unpopped
    // if popped then capacity and amount should be 0

    // EXERCISE: constructor code is long, fix it!
    // EXERCISE: add a way to capture the number of balloons popped
    // EXERCISE: Balloons should have a colour, defaults to "red",
    // allow the user to supply a colour for a new Balloon

    public Balloon(){ this("Red", -1); }

    public Balloon(String colour, int cap){
        this.colour = colour;
        if (cap < 0){
            this.capacity = 100;
        } else {
            this.capacity = cap;
        }
        this.isPopped = false;
        numCreated = numCreated + 1;
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
            this.pop();
        }
        if(this.amount<0)this.amount=0;
    }

    public void deflate(int amount){
        if (this.isPopped) { return; }
        if (this.amount - amount < 0){
            this.amount = 0;
        } else {
            this.amount = this.amount - amount;
        }
    }

    private void pop(){
        if (this.isPopped){
            return;
        }
        this.capacity = 0;
        this.amount = 0;
        this.isPopped = true;
        numPopped = numPopped + 1;
    }

    // EXERCISE: Write a toString() method, overriding the toString() in Object

    public String toString(){
        String s="";
        s=s+"amount="+ this.amount;
        s=s+" capacity="+ this.capacity;
        s=s+" color="+ this.colour;
        s=s+" popped="+ this.isPopped;
        return s;
    }

    public static void main(String[] args) {
        // EXERCISE: Create various Balloons, inflate them till they pop
        // EXERCISE: Create an array of 10 balloons, with capacity 0 to 90
        // EXERCISE: Create a method that inflates an array of balloons by the specified amount
        // EXERCISE: use your new method on the array of balloons
        // EXERCISE: Redo the above three so that it works for an ArrayList
    }
}
