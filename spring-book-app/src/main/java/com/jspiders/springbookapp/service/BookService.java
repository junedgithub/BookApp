package com.jspiders.springbookapp.service;

import com.jspiders.springbookapp.domain.Book;
import com.jspiders.springbookapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
@Autowired
    private BookRepository repository;

    public List<Book> getBooks(){
        List<Book> books = repository.findAll();
        return books;
    }

    public Book addNewBook(Book book)
    {
        return repository.save(book);
    }

    public void deleteBook(int id)
    {
        repository.deleteById(id);
    }

    public Book findById(int id){
        return repository.findById(id);
    }

    public Book updateBook(Book book)
    {
        repository.save(book);
        return book;
    }
}
