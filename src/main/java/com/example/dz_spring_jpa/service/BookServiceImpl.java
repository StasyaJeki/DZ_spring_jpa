package com.example.dz_spring_jpa.service;

import com.example.dz_spring_jpa.dao.BookDAO;
import com.example.dz_spring_jpa.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookDAO bookDAO;
    @Override
    public List<Book> getAll() {
        return bookDAO.getAll();
    }

    @Override
    public Book getById(int id) {
        return bookDAO.getById(id);
    }

    @Override
    public void delete(int id) {
        bookDAO.delete(id);
    }

    @Override
    public Book update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public Book create(Book book) {
        return bookDAO.create(book);
    }
}
