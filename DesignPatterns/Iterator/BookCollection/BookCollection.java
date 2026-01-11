import java.util.ArrayList;

class BookCollection{
  private ArrayList<Book> books;

  public BookCollection(){
    books = new ArrayList<>();
  }

  public void addBook(Book book){
    books.add(book);
  }

  public genreIterator createGenreIterator(String genre){
    return genreIterator(this.books, genre);
  }

  public bookIterator createBookIterator(){
    return bookIterator(this.books);
  }
}
