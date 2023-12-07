package com.payu.entity;


import lombok.*;

import javax.persistence.*;
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

    private String publishDate;

    private double price;

    private BookType bookType;
}
