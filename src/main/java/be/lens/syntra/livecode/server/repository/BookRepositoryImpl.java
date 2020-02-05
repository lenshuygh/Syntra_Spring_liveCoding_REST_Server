package be.lens.syntra.livecode.server.repository;

import be.lens.syntra.livecode.server.model.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private Map<String, Book> books;

    @PostConstruct
    private void init() {
        books = new HashMap<>();
        books.put("12345678", Book.builder().author("Lens Huygh").isbn("12345678").title("Java High Velocity").price(new BigDecimal("28.90")).build());
        books.put("66666666", Book.builder().author("Anonymous").isbn("66666666").title("Lords fo Chaos").price(new BigDecimal("6.66")).build());
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }
}
