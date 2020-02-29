package org.jrue.tutorials;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jrue.tutorials.dao.BookDao;
import org.junit.Assert;

public class BookTest {

    private BookDao dao;

    @Before
    public void setup() {
        dao = new BookDao();
    }

    @Given("I have a book dao")
    public void daoIsAvailable() {
        Assert.assertNotNull(dao);
    }


    @When("User try to add new book with title {string} and rating {string}")
    public void createNewBook(String title, String rating) {
        System.out.println("Title: " + title + ", rating: " + rating);
    }

    @Then("{string} will be available in the list of books")
    public void bookIsAvailable(String book) {
        System.out.println("Title: " + book);
    }
}
