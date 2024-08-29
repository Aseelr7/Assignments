package Answers.Variables;

public class InventoryCheck {

    public static void main(String[] args) {

        int fictionBooks = 20;
        int nonFictionBooks = 10;
        int comicBooks = 5;
        int totalBooks = fictionBooks + nonFictionBooks + comicBooks;
        System.out.println("We have " + totalBooks + " books in stock!");
        System.out.println( "We have " + (fictionBooks + nonFictionBooks + comicBooks) + " books in stock!");

    }
}
