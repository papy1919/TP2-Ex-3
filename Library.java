import java.util.ArrayList;

class Library {
    public ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listAllBooks() {
        for (Book book : books) {
            if (book instanceof Novel || book instanceof Textbook) {
                book.displayInformation();
            } else {
                System.out.println("the title is" + book.getTitle() + "the author is" + book.getAuthor() + "the year of publication is" + book.getYearOfPublication());
            }
        }
    }
}