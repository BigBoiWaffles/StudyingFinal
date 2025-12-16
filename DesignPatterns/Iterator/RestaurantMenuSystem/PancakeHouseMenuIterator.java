package RestaurantMenuSystem;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PancakeHouseMenuIterator implements Iterator{
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.items = menuItems;
    }

    @Override
    public boolean hasNext(){
        return this.position < this.items.size();
    }

    @Override
    public MenuItem next(){
        if (!hasNext()){
            throw new NoSuchElementException("No more items in the menu");
        }
        MenuItem item = items.get(position);
        this.position = this.position + 1;
        return item;
    }
}
