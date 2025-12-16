package Pizza;

import java.util.ArrayList;

public class PizzaBuilder implements BuilderP{
    String size;
    String crustType;
    ArrayList<String> toppings;

    public PizzaBuilder(){
        this.toppings = new ArrayList<String>();
    }

    @Override
    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrustType(String crustType){
        this.crustType = crustType;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(String toppings){
        this.toppings.add(toppings);
        return this;
    }

    public Pizza build(){
        return new Pizza(this);
    }
}
