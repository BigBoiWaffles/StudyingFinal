package Pizza;

import java.util.ArrayList;

public class Pizza {
    private final String size;
    private final String crustType;
    private final ArrayList<String> toppings;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crustType = builder.crustType;;
        this.toppings = builder.toppings;
    }

    //Getters
    public String getSize(){ return this.size; }
    public String getCrustType() { return this.crustType; }
    public ArrayList<String> getToppigns() { return this.toppings; }
}
