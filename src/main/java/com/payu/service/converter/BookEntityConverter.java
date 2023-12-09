package com.payu.service.converter;

import com.payu.api.BookDTO;
import com.payu.entity.BookEntity;
import com.payu.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookEntityConverter implements Converter<BookEntity, BookDTO> {

    @Autowired
    private BookRepository repository;

    @Override
    public BookDTO convert(BookEntity source) {
        BookEntity entity = repository.getReferenceById(source.getId());

        BookDTO bookDto = new BookDTO();
        bookDto.setId(entity.getId());
        bookDto.setName(entity.getName());
        bookDto.setIsbnNumber(entity.getIsbnNumber());
        bookDto.setPrice(entity.getPrice());
        bookDto.setBookType(entity.getBookType());
        bookDto.setPublishDate(entity.getPublishDate());
        return bookDto;
    }
}
