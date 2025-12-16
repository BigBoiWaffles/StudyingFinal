package RestaurantMenuSystem;

public class DinerMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu(){
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);
        addItem("Hot Dog",
                "A hot dog, with sauerkraut, relish, onions",
                false,
                3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                true,
                3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, meny is full! Can't add item to meny");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public DinerMenuIterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}

