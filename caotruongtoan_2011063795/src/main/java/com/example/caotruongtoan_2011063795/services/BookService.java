package com.example.caotruongtoan_2011063795.services;

import com.example.caotruongtoan_2011063795.entity.Book;
import com.example.caotruongtoan_2011063795.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book update){
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book ID: " + id));
        book.setTitle(update.getTitle());
        book.setAuthor(update.getAuthor());
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {bookRepository.deleteById(id);}



}
