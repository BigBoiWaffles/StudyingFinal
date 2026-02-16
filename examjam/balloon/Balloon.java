// package ca.utoronto.utm.examjam.balloon;

import java.util.ArrayList;

public class Balloon {

    private static int numCreated = 0; // total number of Balloons ever created
    public static int getNumCreated() { return numCreated; }

    public static int numPopped = 0;
    public static int getNumPopped(){ return numPopped; }

    private int amount;      // 0<=amount
    private int capacity;    // 0<=amount<=capacity
    private boolean isPopped; // balloons can only be popped once and can never be unpopped
    // if popped then capacity and amount should be 0
    //
    private String colour;

    // EXERCISE: constructor code is long, fix it!
    // EXERCISE: add a way to capture the number of balloons popped
    // EXERCISE: Balloons should have a colour, defaults to "red",
    // allow the user to supply a colour for a new Balloon
    public Balloon(int cap, String colour) {
      if(cap<0) {
        cap=0;
      }
      this.capacity = cap;
      this.amount = 0;
      this.isPopped = false;
      this.colour = colour;
      numCreated += 1;
    }

    public Balloon(){
      this(100, "red");
    }

    public void setColour(String colour){
      this.colour = colour;
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

    private void pop(){
      this.isPopped = true;
      this.capacity = 0;
      this.amount = 0;
      numPopped = numPopped + 1;
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
          return;
        }
        if(this.amount<0)this.amount=0;
    }

    // EXERCISE: Write a toString() method, overriding the toString() in Object

    public String toString(){
      return "Balloon Colour: " + this.colour + ", Balloon is popped: " + this.getIsPopped() + ", Balloon capacity: " + this.getCapacity() + ", Balloon amount: " + this.getAmount();
    }

    public static void main(String[] args) {
        // EXERCISE: Create various Balloons, inflate them till they pop
        Balloon b1 = new Balloon();
        Balloon b2 = new Balloon(100, "Blue");

        System.out.println(b1);
        System.out.println(b2);

        b1.inflate(50);
        b2.inflate(25);

        System.out.println(b1);
        System.out.println(b2);

        b1.inflate(60);
        b2.inflate(75);
        
        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1.getNumCreated());

        System.out.println(b2.getNumCreated());

        System.out.println(b1.getNumPopped());
        // EXERCISE: Create an array of 10 balloons, with capacity 0 to 90
        // EXERCISE: Create a method that inflates an array of balloons by the specified amount
        // EXERCISE: use your new method on the array of balloons
        // EXERCISE: Redo the above three so that it works for an ArrayList
    }
}
