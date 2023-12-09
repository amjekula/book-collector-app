package com.payu.service.converter;

import com.payu.api.BookDTO;
import com.payu.entity.BookEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookDTOConverter implements Converter<BookDTO, BookEntity> {

    @Override
    public BookEntity convert(BookDTO source) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(source.getId());
        bookEntity.setName(source.getName());
        bookEntity.setIsbnNumber(source.getIsbnNumber());
        bookEntity.setPrice(source.getPrice());
        bookEntity.setBookType(source.getBookType());
        bookEntity.setPublishDate(source.getPublishDate());
        return bookEntity;
    }

}
