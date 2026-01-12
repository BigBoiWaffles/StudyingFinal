import java.util.ArrayList;

public class genreIterator implements Iterator {
  private ArrayList<Book> collection;
  private boolean hasNext = true;
  private int currentPosition = 0;
  private String genre;

  public genreIterator(ArrayList<Book> collection, String genre){
    this.collection = new ArrayList<Book>();
    this.genre = genre;

    for (Book book : collection){
      if (book.getGenre() == this.genre){
        this.collection.add(book);
      }
    }
  }

  @Override
  public Book getNext(){
    if (hasMore()){
      currentPosition = currentPosition + 1;
      return collection.get(currentPosition - 1);
    }
    return null;
  }

  @Override
  public Boolean hasMore(){
    return currentPosition < this.collection.size();
  }
}
