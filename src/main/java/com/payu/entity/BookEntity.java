package com.payu.entity;

import com.sun.istack.NotNull;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class BookEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String isbnNumber;

    @NotNull
    private String publishDate;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private LocalDate publishDate;

    private double price;

    private BookType bookType;
}
