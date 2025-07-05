package com.example.library;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService Constructor called.");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected via setter.");
    }

    public void displayService() {
        System.out.println("BookService is working.");
        if (bookRepository != null) {
            bookRepository.printRepositoryStatus();
        } else {
            System.out.println("BookRepository is not initialized.");
        }
    }
}
