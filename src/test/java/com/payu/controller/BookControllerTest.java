package com.payu.controller;

import com.payu.api.BookDto;
import com.payu.entity.BookType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class BookControllerTest {

//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private BookDto bookDto;
//    private static final String BASE_URL = "http://localhost:8080/book/collector";
//
//    @BeforeEach
//    void setUp() {
////        Faker data = new Faker();
////        bookEntity = BookEntity.builder()
////                .name(data.book().title())
////                .isbnNumber(data.number().digits(10))
////                .price(data.number().numberBetween(50, 500))
////                .publishDate(Instant.now())
////                .bookType(BookType.values()[RandomUtils.nextInt(0, BookType.values().length)])
////                .id(RandomUtils.nextInt())
////                .build();
////        Faker data = new Faker();
////        bookEntity = BookEntity.builder()
////                .name("Athenkosi")
////                .isbnNumber(data.number().digits(10))
////                .price(data.number().numberBetween(50, 500))
////                .publishDate(Instant.now())
////                .bookType(BookType.values()[RandomUtils.nextInt(0, BookType.values().length)])
////                .build();
//        bookDto = new BookDto();
//        bookDto.setName("Athenkosi");
//        bookDto.setIsbnNumber("11111");
//        bookDto.setPublishDate(Instant.now());
//        bookDto.setBookType(BookType.E_BOOK);
//        bookDto.setPrice(26.99);
//    }
//
//    @Test
//    void add() {
//        String url = BASE_URL + "/add";
//        System.out.println("URL: " + url);
//        ResponseEntity<BookDto> postResponse = restTemplate
//                .postForEntity(url, bookDto, BookDto.class);
//
//        System.out.println("Status Code: " + postResponse.getStatusCode());
//        bookDto = postResponse.getBody();
//        System.out.println("Control Clerk: " + bookDto);
//        assertEquals(bookDto.getName(), postResponse.getBody().getName());
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void delete() {
//    }
//
//    @Test
//    void list() {
//    }
}