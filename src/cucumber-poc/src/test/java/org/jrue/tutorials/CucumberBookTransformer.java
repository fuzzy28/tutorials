package org.jrue.tutorials;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.TableTransformer;

import java.util.ArrayList;
import java.util.List;

public class CucumberBookTransformer implements TableTransformer<CucumberBookTransformer> {

    private List<Book> books = new ArrayList<>();

    @Override
    public CucumberBookTransformer transform(DataTable dataTable) throws Throwable {
        CucumberBookTransformer transformer = new CucumberBookTransformer();
        dataTable.cells().stream().forEach(b -> {
            Book book = new Book();
            book.setTitle(b.get(0));
            book.setRating(Double.valueOf(b.get(1)));
            transformer.books.add(book);
        });
        return transformer;
    }

    public List<Book> getBooks() {
        return books;
    }
}
