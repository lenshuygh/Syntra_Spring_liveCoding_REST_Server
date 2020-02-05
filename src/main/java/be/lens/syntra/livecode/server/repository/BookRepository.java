package be.lens.syntra.livecode.server.repository;

import be.lens.syntra.livecode.server.model.Book;

import java.util.List;

public interface BookRepository {
    Book getBookByIsbn(String isbn);

    List<Book> getAllBooks();
}
