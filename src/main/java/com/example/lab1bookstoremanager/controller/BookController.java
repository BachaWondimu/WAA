package com.example.lab1bookstoremanager.controller;

import com.example.lab1bookstoremanager.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private final List<Book> books = new ArrayList<>();;
    @GetMapping("/books")
    public List<Book> getBooks() {
        addBook();
        return books;
    }

    public void addBook(){
        books.add(new Book(1, "The Great Gatsby", "978-0-7432-7356-5", "F. Scott Fitzgerald"));
        books.add(new Book(2, "To Kill a Mockingbird", "978-0-06-112008-4", "Harper Lee"));
        books.add(new Book(3, "1984", "978-0-452-28423-4", "George Orwell"));
        books.add(new Book(4, "Pride and Prejudice", "978-0-14-143951-8", "Jane Austen"));
        books.add(new Book(5, "The Catcher in the Rye", "978-0-316-76948-0", "J.D. Salinger"));
    }
}
