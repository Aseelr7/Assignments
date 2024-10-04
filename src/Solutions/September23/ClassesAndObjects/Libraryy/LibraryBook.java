package Solutions.September23.ClassesAndObjects.Libraryy;

public class LibraryBook {
    String title;
    String author;
    int ISBN;

    public LibraryBook(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookInfo(){
        System.out.println("The title of the book is: " + title);
        System.out.println("The book is written by: " + author);
        System.out.println("ISBN: " + ISBN);
    }

}

class Librarian{
    String librarianName;
    String employedAt;
    LibraryBook currentlyReading;

    public Librarian(String librarianName, String employedAt, LibraryBook currentlyReading) {
        this.librarianName = librarianName;
        this.employedAt = employedAt;
        this.currentlyReading = currentlyReading;
    }

        public void displayLibrarian(){
            System.out.println("Librarian name: " + librarianName);
            System.out.println("Works at: " + employedAt);
            System.out.println("Currently reading " + currentlyReading.title + " By " + currentlyReading.author + "\n ISBN: " + currentlyReading.ISBN);
        }
    }

