package org.jrue.tutorials;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.TableTransformer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CucumberBookTransformer implements TableTransformer<CucumberBookTransformer> {

    private List<Book> books = new ArrayList<>();

    @Override
    public CucumberBookTransformer transform(DataTable dataTable) throws Throwable {
        dataTable.cells().stream().forEach(b -> {
            Book book = new Book();
            book.setTitle(b.get(0));
            book.setRating(Double.valueOf(b.get(1)));
            books.add(book);
        });
        return this;
    }

    public List<Book> getBooks() {
        return books;
    }
}
