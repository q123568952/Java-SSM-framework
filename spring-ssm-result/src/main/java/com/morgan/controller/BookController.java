package com.morgan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.morgan.domain.Book;
import com.morgan.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
        }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;    
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
       bookService.delete(id); 
       return true;
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
       bookService.getById(id);
        return bookService.getById(id);

    }

    @GetMapping
    public List<Book> getAll() {
    return bookService.getAll(); 
    }
    
}
