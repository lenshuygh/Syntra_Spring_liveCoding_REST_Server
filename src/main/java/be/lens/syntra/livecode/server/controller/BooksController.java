package be.lens.syntra.livecode.server.controller;

import be.lens.syntra.livecode.server.dto.BookList;
import be.lens.syntra.livecode.server.model.Book;
import be.lens.syntra.livecode.server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("{isbn}")
    public Book getBook(@PathVariable("isbn") String isbn){
        return bookService.getBook(isbn);
    }

    @GetMapping
    public BookList getBooks(){
        return new BookList(bookService.getAllBooks());
    }
}
