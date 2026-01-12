import java.util.ArrayList;

public class bookIterator implements Iterator{
  private ArrayList<Book> collection;
  private boolean hasNext = true;
  private int currentPosition = 0;

  public bookIterator(ArrayList<Book> collection){
    this.collection = collection;
  }

  @Override
  public Book getNext(){
    if (hasMore()) {
      currentPosition = currentPosition + 1;
      return this.collection.get(currentPosition - 1);
    }
    return null;
  }

  @Override
  public Boolean hasMore(){
    return currentPosition < collection.size();
  }
}
