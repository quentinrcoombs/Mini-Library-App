# Mini Library App

A simple Java-based library management system demonstrating **object-oriented programming (OOP)** concepts such as **classes, encapsulation, and interactions between objects**.  

This project was built to showcase hands-on Java skills, including class design, data encapsulation, and basic user interaction through the console.

---

## Features

- Add books to the library
- View all books and their status (available/checked out)
- Check out a book
- Return a book
- Demonstrates **encapsulation** with `Book` and `Library` classes
- Simple console-based menu for user interaction

---

## Project Structure

- `Book.java` – Represents a book with attributes like title, author, ISBN, and availability. Encapsulates data using **private fields** and public getter/setter methods.  
- `Library.java` – Manages a collection of `Book` objects and provides methods to add, check out, return, and list books.  
- `MiniLibraryApp.java` – Main application that interacts with the user and demonstrates the functionality of the library system.  

> During development, a **temporary main method** was added in `Book.java` to test usability of the class before integrating it into the main app.

---

## How to Run

1. Ensure you have **Java installed** on your system.  
2. Clone the repository:  
   ```bash
   git clone https://github.com/YourUsername/MiniLibraryApp.git
