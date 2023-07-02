package com.morgan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgan.dao.BookDao;
import com.morgan.domain.Book;
import com.morgan.service.BookService;
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
        }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) >0;
           
    }

    @Override
    public boolean delete(Integer id) {
      return  bookDao.delete(id)>0; 
    }

    @Override
    public Book getById(Integer id) {
       bookDao.getById(id);
        return bookDao.getById(id);

    }

    @Override
    public List<Book> getAll() {
    return bookDao.getAll(); 
    }
    
}
