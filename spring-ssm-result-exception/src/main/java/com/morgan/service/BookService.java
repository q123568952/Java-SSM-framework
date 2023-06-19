package com.morgan.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.morgan.domain.Book;

@Transactional
public interface BookService {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);    

    public Book getById(Integer id);

    public List<Book> getAll();
}
