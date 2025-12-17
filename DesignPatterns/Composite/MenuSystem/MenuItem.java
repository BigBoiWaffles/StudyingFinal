package MenuSystem;

public class MenuItem implements MenuComponent{
    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public double getPrice() { return price; }

    @Override
    public boolean isVegetarian() { return isVegetarian; }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print(" (V)");
        }
        System.out.println(", $" + getPrice());
        System.out.println("    -- " + getDescription());
    }
}