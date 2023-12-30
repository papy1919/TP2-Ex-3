import java.util.Scanner;

class LibraryCard {
    int id;
    int cin;
    String name;
    String surname;

    public LibraryCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID, CIN, Name, Surname:");
        this.id = sc.nextInt();
        this.cin = sc.nextInt();
        sc.nextLine();
        this.name = sc.nextLine();
        this.surname = sc.nextLine();
    }

    int getId() {
        return this.id;
    }

    int getCin() {
        return this.cin;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
