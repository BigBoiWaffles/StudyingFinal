package MenuSystem;

import java.util.ArrayList;

public class Menu implements MenuComponent{
    private String name;
    private String description;
    private ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
        this.menuComponents = new ArrayList<MenuComponent>();
    }

    @Override
    public String getName(){ return this.name; }

    @Override
    public String getDescription(){ return this.description; }

    @Override
    public double getPrice(){
        double total = 0.0;
        for (MenuComponent component : menuComponents){
            total = total + component.getPrice();
        }
        return total;
    }

    @Override
    public boolean isVegetarian(){
        boolean allVegetarian = true;
        for (MenuComponent component : menuComponents){
            if (!component.isVegetarian()) {
                return allVegetarian = false;
            }
        }
        return allVegetarian;
    }

    @Override
    public void print(){
        System.out.println("\n" + getName());
        System.out.println(getDescription());
        System.out.println("---------------------");

        // Recursively print all children
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }

    public void add(MenuComponent component){
        this.menuComponents.add(component);
    }

    public void remove(MenuComponent component){
        this.menuComponents.remove(component);
    }

}
