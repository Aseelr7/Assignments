package Solutions.September23.ClassesAndObjects.Libraryy;

public class LibRunner {
    public static void main(String[] args) {

   /*     LibraryBook book = new LibraryBook();
        book.title = "Journey to the Center of Earth";
        book.author = "Jules Verne";
        book.ISBN = 1122334;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.ISBN);*/

        LibraryBook book = new LibraryBook("Zero to Hundred", "Peter Thiel", 12441);
        book.displayBookInfo();

        LibraryBook book2 = new LibraryBook("1984", "George Orwell", 987654321);
        LibraryBook book3 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", 1122334455);

        System.out.println("*********************************************************");

        Librarian lib = new Librarian("Meghan", "Howard Community College", book2);

        System.out.println(lib.librarianName);
        System.out.println(lib.currentlyReading.title + " by " + lib.currentlyReading.author);

        System.out.println("*******************************************************************************");

        LibraryBook[] array = {book,book2,book3};
        for (LibraryBook eachBook : array){
            eachBook.displayBookInfo();
        }

    }
}
