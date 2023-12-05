package com.payu.entity;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class BookEntityTest {

    private BookEntity bookEntity;

    @BeforeEach
    void setUp() {
//        Faker data = new Faker();
//        bookEntity = BookEntity.builder()
//                .name(data.book().title())
//                .isbnNumber(data.number().digits(10))
//                .price(data.number().numberBetween(50, 500))
//                .publishDate(Instant.now())
//                .bookType(BookType.values()[RandomUtils.nextInt(0, BookType.values().length)])
//                .id(RandomUtils.nextInt())
//                .build();
    }


    @Test
    public void testBookEntity(){
                // Define the date format
//        OffsetDateTime offsetDateTime = OffsetDateTime.parse("05-12-2023");
//        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse("05-12-2023");
//
//        // Output the Instant
//        System.out.println("Instant: " + date);
////        System.out.println("Instant: " + offsetDateTime.toLocalDate().format(pattern));
//        System.out.println(bookEntity);
    }
}