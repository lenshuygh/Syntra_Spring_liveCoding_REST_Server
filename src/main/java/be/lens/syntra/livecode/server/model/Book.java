package be.lens.syntra.livecode.server.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {
    private String isbn;
    private String title;
    private String author;
    private BigDecimal price;
}
