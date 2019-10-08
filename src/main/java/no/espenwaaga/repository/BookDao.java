package no.espenwaaga.repository;

import no.espenwaaga.model.Book;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookDao {

    private Map<String, Book> books;

    public BookDao() {
        books = new HashMap<String, Book>();
        Book book1 =  new Book();
        book1.setId("1");
        book1.setTitle("Lord of the Rings");
        book1.setAuthor("J.R.R Tolkien");
        book1.setIsbn("1234");
        book1.setPublished(new Date());

        Book book2 = new Book();
        book2.setId("2");
        book2.setTitle("Silmarillion");
        book2.setAuthor("J.R.R Tolkien");
        book2.setIsbn("5678");
        book2.setPublished(new Date());

        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);

    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public Book getBook(String id) {
        return books.get(id);
    }
}
