
class mainLib {
    public static void main(String[] args) {

        Book book1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "A tragic love story");
        Book book2 = new Textbook("Introduction to Java", "John Doe", 2020, 400, 15, "Programming");


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);


        library.listAllBooks();


        Student student = new Student();
        student.borrowBook();


        Teacher teacher = new Teacher();
        teacher.borrowBook();
    }
}