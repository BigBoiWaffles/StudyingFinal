package Pizza;

public class DirectorP {
    public void constructMeatLoversPizza(BuilderP builder){
        builder.setSize("Large");
        builder.setCrustType("Cheese-Filled");
        builder.addToppings("Pepperoni");
        builder.addToppings("Sausage");
        builder.addToppings("Bacon");
    }

    public void constructVeggiePizza(BuilderP builder){
        builder.setSize("Large");
        builder.setCrustType("Normal");

        builder.addToppings("Peppers");
        builder.addToppings("Olives");
        builder.addToppings("Onions");
    }
}
