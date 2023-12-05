package com.payu.controller;

import com.payu.api.BookApi;
import com.payu.api.BookDto;
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
    public ResponseEntity<BookDto> add(BookDto bookDto) {
        return ResponseEntity.ok(service.add(bookDto));
    }

    @Override
    public ResponseEntity<BookDto> edit(BookDto bookDto) {
        return ResponseEntity.ok(service.edit(bookDto));
    }

    @Override
    public ResponseEntity<Void> delete(Long bookId) {
        service.delete(bookId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<BookDto>> list() {
        return ResponseEntity.ok(service.list());
    }
}
