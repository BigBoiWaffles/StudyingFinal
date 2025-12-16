package Pizza;

public interface BuilderP {
    BuilderP setSize(String size);
    BuilderP setCrustType(String crustType);
    BuilderP addToppings(String topping);
    Pizza build();
}
