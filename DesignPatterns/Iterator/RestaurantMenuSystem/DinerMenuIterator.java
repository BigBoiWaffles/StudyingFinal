package RestaurantMenuSystem;

import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator{
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItem){
        this.menuItems = menuItem;
    }

    @Override
    public boolean hasNext(){
        if (position >= menuItems.length || menuItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next(){
        if (!hasNext()){
            throw new NoSuchElementException("No more items in the menu");
        }
        MenuItem item = menuItems[position];
        this.position = this.position + 1;
        return item;
    }
}
