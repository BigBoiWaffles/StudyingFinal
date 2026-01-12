import java.util.ArrayList;

public class BookCollection{
  private ArrayList<Book> books;

  public BookCollection(){
    books = new ArrayList<>();
  }

  public void addBook(Book book){
    books.add(book);
  }

  public genreIterator createGenreIterator(String genre){
    return new genreIterator(this.books, genre);
  }

  public bookIterator createBookIterator(){
    return new bookIterator(this.books);
  }
}
