class Student implements LibraryUser {
    LibraryCard c = new LibraryCard();

    public void borrowBook() {
        System.out.println("the student " + c.getName() + " " + c.getSurname() + " Borrowed a book");
    }

    public void returnBook() {
        System.out.println("the student " + c.getName() + " " + c.getSurname() + " Returned a book");
    }
}

class Teacher implements LibraryUser {
    LibraryCard c = new LibraryCard();

    public void borrowBook() {
        System.out.println("the teacher " + c.getName() + " " + c.getSurname() + " Borrowed a book");
    }

    public void returnBook() {
        System.out.println("the teacher " + c.getName() + " " + c.getSurname() + " Returned a book");
    }
}