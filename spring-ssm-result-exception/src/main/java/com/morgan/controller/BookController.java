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
    public Result save(@RequestBody Book book) {
       boolean flag =  bookService.save(book);
        return new Result(flag ? Code.SAVE_OK: Code.SAVE_ERR,flag);
        }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK: Code.UPDATE_ERR,flag);  
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
       boolean flag = bookService.delete(id); 
       return new Result(flag ? Code.DELETE_OK: Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
       Book book = bookService.getById(id);
       Integer code = book != null ? Code.GET_OK: Code.GET_ERR;
       String msg = book != null ? "":"數據查詢失敗請重試";
       return new Result(code, book, msg);

    }

    @GetMapping
    public Result getAll() {
       List<Book> books = bookService.getAll();
       Integer code = books != null ? Code.GET_OK: Code.GET_ERR;
       String msg = books != null ? "":"數據查詢失敗請重試";
       return new Result(code, books, msg);
    }
    
}
