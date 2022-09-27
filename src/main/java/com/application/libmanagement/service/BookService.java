package com.application.libmanagement.service;

import com.application.libmanagement.entity.Book;
import com.application.libmanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book with id " + id + "not found"));
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book with id " + id + "not found"));
        bookRepository.deleteById(book.getId());
    }
}
