package com.jspiders.springbookapp.controller;

import com.jspiders.springbookapp.domain.Book;
import com.jspiders.springbookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;
    @GetMapping("/")
    public String getWelcomePage(){
        return "welcome";
    }

    @GetMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", service.getBooks() );
        return "book";
    }

    @GetMapping("/addbook")
    public String viewBookForm(Model model)
    {
        model.addAttribute("book", new Book());
        return "bookform.html";
    }

    @PostMapping("/savebook")
    public String addNewBook(Book book)
    {
         service.addNewBook(book);
         return "redirect:/";
    }

    @GetMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable int id)
    {
       service.deleteBook(id);
       return "redirect:/";
    }

    @GetMapping("/updatebook/{id}")
    public String updateBook(@PathVariable int id,Model model)
    {
        Book book = service.findById(id);
        model.addAttribute("book",book);
        return "updateform";
    }

    @PostMapping("/modifybook")
    public String modifyBook(Book book)
    {
        service.updateBook(book);
        return "redirect:/";
    }


}
