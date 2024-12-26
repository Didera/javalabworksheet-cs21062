import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Books book1 = new Books("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Books book2 = new Books("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Books book3 = new Books("Island of a Thousand Mirrors","Nayomi Munaweera", "9781616953623");

       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();

        Library library = new Library();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);
        library.checkoutItem(name);
        library.listAvailableItems();


    }
}
