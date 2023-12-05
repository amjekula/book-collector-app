package com.payu.service.converter;

import com.payu.api.BookDto;
import com.payu.entity.BookEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
public class BookDtoConverter implements Converter<BookDto, BookEntity> {

    @Override
    public BookEntity convert(BookDto source) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(source.getId());
        bookEntity.setName(source.getName());
        bookEntity.setIsbnNumber(source.getIsbnNumber());
        bookEntity.setPrice(source.getPrice());
        bookEntity.setBookType(source.getBookType());
        bookEntity.setPublishDate(CustomDateFormat.formatDate(source.getPublishDate()));
        return bookEntity;
    }

}
