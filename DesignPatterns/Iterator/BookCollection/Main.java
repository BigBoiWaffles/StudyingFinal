public class Main{
  public static void main(String[] args){
    BookCollection library = new BookCollection();
    library.addBook(new Book("1984", "George Orwell", "Dystopian"));
    library.addBook(new Book("Dune", "Frank Herbert", "Sci-Fi"));
    library.addBook(new Book("Foundation", "Isaac Asimov", "Sci-Fi"));

    library.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian"));
  }
}
