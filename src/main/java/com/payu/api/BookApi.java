package com.payu.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Validated
public interface BookApi {

    @PostMapping("/add")
    ResponseEntity<BookDTO> add(@RequestBody BookDTO bookDto);

    @PostMapping("/update")
    ResponseEntity<BookDTO> edit(@RequestBody BookDTO bookDto);

    @DeleteMapping("/delete/{bookId}")
    ResponseEntity<Void> delete(@PathVariable Long bookId);

    @GetMapping("/list")
    ResponseEntity<List<BookDTO>> list();

    @GetMapping("/get/{bookId}")
    ResponseEntity<BookDTO> getBook(@PathVariable("bookId") Long bookId);

    @GetMapping("/find/{bookName}")
    ResponseEntity<List<BookDTO>> findBooksByName(@PathVariable("bookName") String bookName);
}
