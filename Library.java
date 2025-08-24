//This is Library.java
//This class manages a collection of Book objects and provides methods
//to add, list, check out, and return books.

import java.util.ArrayList; //imports ArrayList to store books

public class Library {

    //Field: list all books in library
    private ArrayList<Book> books;

    //Constructor: init the books list
    public Library() {
        books = new ArrayList<>(); //create an empty array list
    }

    //Temp Main method for testing
    /*public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("1984", "George Orwell", "123"));
        lib.addBook(new Book("The Hunger Games", "Suzanne Collins", "4321"));
        
        lib.listBooks();
        lib.checkOutBook(0);
        lib.listBooks();
        lib.returnBook(0);
        lib.listBooks();
    }
        */


    //Method to add new book to library list
    public void addBook(Book book) {
        books.add(book); //add book to the list
        System.out.println("Book added: " + book.getTitle());
    }

    //Method to  list all books in the library
    public void listBooks() {
        if (books.isEmpty()) { //checks if list is empty
            System.out.println("Library is empty!");
            return; //exit method if no books
        }

        //Loop through all books and prints them
        for (int i =0; i < books.size(); i++ ) {
            System.out.println((i + 1) + ". " + books.get(i)); // uses book's toString() method

        }
    }

    //Method to check out a book
    public void checkOutBook (int index) {
        if (index >= 0 && index < books.size()) { //validate index
            Book book = books.get(index); //get the book at that index
            if(book.isAvailable()) { //checks if available
               book.setAvailable(false); //marks as checked out
            System.out.println("Checked out: " + book.getTitle());
        
        } else {
            System.out.println("Book already checked out!");
        }

    } else {
        System.out.println("Invalid book number."); //invalid index
    
    }


  }
//method to return book
public void returnBook(int index) {
    if (index >= 0 && index < books.size()) {
        Book book = books.get(index);
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Returned: " + book.getTitle());
        } else {
            System.out.println("Book was not checked out.");
        }
    } else {
        System.out.println("Invalid book number.");
    }

  }

}
