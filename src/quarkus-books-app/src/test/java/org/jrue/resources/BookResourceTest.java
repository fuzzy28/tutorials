package org.jrue.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void testGetAllBooks() {
        given()
          .when().get("/books")
          .then()
             .statusCode(200)
             .body(is("{}"));
    }

}