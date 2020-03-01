package org.jrue.tutorials;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jrue.tutorials.dao.BookDao;
import org.junit.Assert;

public class BookDeleteTest {

    private BookDao dao;

    @Before
    public void setup() {
        dao = new BookDao();
    }

    @Given("I have books in my database for deletion")
    public void initializingBooks(CucumberBookTransformer bookTransformer) {
        bookTransformer.getBooks().forEach(dao::add);
    }

    @When("I deleted the books")
    public void deleteMultipleObjects(CucumberBookTransformer bookTransformer) {
        bookTransformer.getBooks().forEach(b -> {
            System.out.println("DELETING BOOK " + b.getTitle());
            dao.remove(dao.findbyTitle(b.getTitle()).getId());
        });
    }

    @Then("I only have 2 books")
    public void checkRemainingBooks() {
        Assert.assertEquals(2, dao.getAllBooks().size());
    }

    @And("those books are")
    public void validateRemainingBooks(CucumberBookTransformer bookTransformer) {
        bookTransformer.getBooks().forEach(b -> {
            Assert.assertNotNull(dao.findbyTitle(b.getTitle()));
        });
    }
}
