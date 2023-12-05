package com.payu.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
public interface BookApi {

    @PostMapping("/add")
    ResponseEntity<BookDto> add(@RequestBody BookDto bookDto);

    @PutMapping("/update")
    ResponseEntity<BookDto> edit(@RequestBody BookDto bookDto);

    @DeleteMapping("/delete/{bookId}")
    ResponseEntity<Void> delete(@PathVariable Long bookId);

    @GetMapping("/list")
    ResponseEntity<List<BookDto>> list();
}
