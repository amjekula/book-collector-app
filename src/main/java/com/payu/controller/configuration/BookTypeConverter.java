package com.payu.controller.configuration;

import com.payu.entity.BookType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookTypeConverter implements Converter<String, BookType> {

    @Override
    public BookType convert(String source) {
        return BookType.valueOf(source.toUpperCase());
    }
}
