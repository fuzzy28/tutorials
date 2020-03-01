package org.jrue.tutorials;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jrue.tutorials.dao.BookDao;
import org.junit.Assert;

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
    public void updateRatingOfBook(String title, String rating) {
       Book b = dao.findbyTitle(title);
       b.setRating(Double.valueOf(rating));
       dao.update(b.getId(), b);
    }

    @Then("the rating of {string} is now {string}")
    public void ratingIsUpdated(String title, String rating) {
        Assert.assertEquals(Double.valueOf(rating).doubleValue(), dao.findbyTitle(title).getRating(), 0.001);
    }

}
