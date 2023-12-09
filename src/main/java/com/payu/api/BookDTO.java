package com.payu.api;

import com.payu.entity.BookType;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class BookDTO {

    private long id;

    @NotNull
    private String name;

    @NotNull
    private String isbnNumber;

    @NotNull
    private String publishDate;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private LocalDate publishDate;

    @NotNull
    private double price;

    @NotNull
    private BookType bookType;
}
