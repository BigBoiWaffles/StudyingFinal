package Pizza;


public class PizzaDemo {
    public static void main(String[] args){
        DirectorP director = new DirectorP();
        PizzaBuilder builder = new PizzaBuilder();

        director.constructMeatLoversPizza(builder);
        Pizza pizza = builder.build();
        System.out.println(pizza.getSize() + pizza.getToppigns());

        Pizza pizza1 = new PizzaBuilder().setSize("Large").build();
        System.out.println(pizza1.getSize() + pizza1.getCrustType());
    }
}
