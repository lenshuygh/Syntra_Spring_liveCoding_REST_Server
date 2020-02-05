package be.lens.syntra.livecode.server.dto;

import be.lens.syntra.livecode.server.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookList {
    private List<Book> books;
}
