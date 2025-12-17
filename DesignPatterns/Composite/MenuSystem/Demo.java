package MenuSystem;

public class Demo {
    public static void main(String [] args){
        Menu allMenus = new Menu("All Menus", "Complete restaurant menu");
        Menu breakfast = new Menu("Breakfast Menu", "Served 6am-11am");
        Menu lunch = new Menu("Lunch Menu", "Served 11am-3pm");

        breakfast.add(new MenuItem("Pancakes", "Stack of 3 fluffy pancakes", 7.99, true));
        breakfast.add(new MenuItem("Omelette", "3-egg omelette", 8.99, true));

        lunch.add(new MenuItem("BLT", "Bacon, lettuce, tomato", 5.99, false));
        lunch.add(new MenuItem("Veggie Sandwich", "Fresh vegetables", 6.49, true));

        allMenus.add(breakfast);
        allMenus.add(lunch);

        allMenus.print();
        // or allMenus.print(0) if using indentation parameter

        System.out.println(breakfast.isVegetarian());
        System.out.println(lunch.isVegetarian());
    }
}
