package org.jrue.tutorials;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.jrue.tutorials.dao.BookDao;

public class BookUpdateTest {

    private BookDao dao;

    @Before
    public void setup() {
        dao = new BookDao();
    }

    @Given("I have books in my database")
    public void initializingBooks(CucumberBookTransformer bookTransformer) {
        bookTransformer.getBooks().forEach(dao::add);
    }

    @When("I update the rating of {string} to {string}")
    public void i_update_the_rating_of_to(String title, String rating) {
       Book b = dao.findbyTitle(title);
       b.setRating(Double.valueOf(rating));
       dao.update(b.getId(), b);
    }

}
