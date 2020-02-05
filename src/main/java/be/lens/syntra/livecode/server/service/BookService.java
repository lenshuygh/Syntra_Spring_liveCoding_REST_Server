package be.lens.syntra.livecode.server.service;

import be.lens.syntra.livecode.server.model.Book;

import java.util.List;

public interface BookService {
    Book getBook(String isbn);

    List<Book> getAllBooks();
}
