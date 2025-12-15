package builder;

import java.util.ArrayList;

public interface BuilderP {
    void setSize(String size);
    void setCrustType(String crustType);
    void setToppings(ArrayList<String> toppings);
}
