package org.jrue.dao;

import org.jrue.domain.Book;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class BookDao {

    private Map<Integer, Book> books = new HashMap<>();

    public List<Book> getAllBooks() {
        return books.values().stream().collect(Collectors.toList());
    }

    public Book findById(int id) {
        return books.getOrDefault(id, new Book());
    }

    public Book add(Book book) {
        int id = 1;
        if(!books.isEmpty()) {
            id += books.size();
        }
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public Book update(int id, Book book)  {
        books.put(id, book);
        return book;
    }

    public void remove(int id) {
        books.remove(id);
    }
}
