package org.jrue.resources;

import org.jrue.dao.BookDao;
import org.jrue.domain.Book;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
public class BookResource {

    @Inject
    BookDao dao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return dao.getAllBooks();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book createBook(Book book) {
        return dao.add(book);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Book updateBook(@PathParam("id") int id, Book book) {
        return dao.update(id,book);
    }

    @DELETE
    @Path("{id}")
    public void deleteBook(@PathParam("id") int id) {
        dao.remove(id);
    }
}