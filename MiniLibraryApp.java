//MiniLibraryApp.java
//Main program users interact with Library class thru a simple terminal menu

import java.util.Scanner; //imports tool for reading user inpur

public class MiniLibraryApp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //Create scanner for input
        Library library = new Library();           //Creates a new Library object

        boolean running = true; //Controls main menu loop

        while (running) {
            //Display menu
            System.out.println("\n--- MINI LIBRARY MENU ---");
            System.out.println("1, Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Check Out Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;

            //Read user input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Invalid input! Enter a number.");
                continue; //go back to menu
            }

            switch (choice) {
                case 1: //Add Book
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, isbn); //create new book
                    library.addBook(newBook); //Add to library
                    break;
                
                case 2: //list books
                    library.listBooks(); //calls Librarys list books method
                    break;

                case 3: //Check out Book
                    library.listBooks();
                    System.out.print("Enter Book Number to Check Out: ");
                    int checkoutNum = scanner.nextInt() - 1; //convert 1-based to 0-based 
                    library.checkOutBook(checkoutNum);
                    break;

                case 4: // Return Book
                    library.listBooks(); //show books with number
                    System.out.print("Enter Book Number to Return: ");
                    int returnNum = scanner.nextInt() - 1;
                    library.returnBook(returnNum);
                    break;

                case 5: //Exit
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close(); //close scanner before exiting
    }
}
