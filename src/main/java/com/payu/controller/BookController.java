package com.payu.controller;

import com.payu.api.BookApi;
import com.payu.api.BookDTO;
import com.payu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/book/collector",
    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
public class BookController implements BookApi {

    @Autowired
    private BookService service;

    @Override
    public ResponseEntity<BookDTO> add(BookDTO bookDto) {
        return ResponseEntity.ok(service.add(bookDto));
    }

    @Override
    public ResponseEntity<BookDTO> edit(BookDTO bookDto) {
        return ResponseEntity.ok(service.edit(bookDto));
    }

    @Override
    public ResponseEntity<Void> delete(Long bookId) {
        service.delete(bookId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<BookDTO>> list() {
        return ResponseEntity.ok(service.list());
    }

    @Override
    public ResponseEntity<BookDTO> getBook(Long bookId) {
        return ResponseEntity.ok(service.findBook(bookId));
    }

    @Override
    public ResponseEntity<List<BookDTO>> findBooksByName(String bookName) {
        return ResponseEntity.ok(service.findBooksByName(bookName));
    }
}
