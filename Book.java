//Book.java
//This class reps a single book in the library
// Stores the book's title, author, ISBN, and avail

public class Book {

    //Creates the variables that store info about the book
    private String title; //title of book
    private String author; //author of book
    private String isbn; //ISBN number
    private boolean isAvailable; //True is book is available

    //Constructor: used to create a new Book 
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    } 

    // Getter methods allow other classes to read private fields
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //Setter method: allows other classes to change availablity
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //toString method: returns a readable string representing the book
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ") "
                + (isAvailable ? "[Available]" : "[Checked Out]");

    }

    // ---Temp Main Method For Testing---
    /*public static void main(String[] args) {
        //new book object
        Book myBook = new Book("1984", "George Orwell", "1234567890");
        
        //Print book info using toString method
        System.out.println(myBook);

        //Change availability and print again
        myBook.setAvailable(false);
        System.out.println(myBook);
    }
    */
}
