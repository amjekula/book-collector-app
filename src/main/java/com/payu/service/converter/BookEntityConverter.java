package com.payu.service.converter;

import com.payu.api.BookDto;
import com.payu.entity.BookEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookEntityConverter implements Converter<BookEntity, BookDto> {

    @Override
    public BookDto convert(BookEntity source) {
        BookDto bookDto = new BookDto();
        bookDto.setId(source.getId());
        bookDto.setName(source.getName());
        bookDto.setIsbnNumber(source.getIsbnNumber());
        bookDto.setPrice(source.getPrice());
        bookDto.setBookType(source.getBookType());
        bookDto.setPublishDate(CustomDateFormat.formatDate(source.getPublishDate()));
        return bookDto;
    }
}
