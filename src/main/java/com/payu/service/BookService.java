package com.payu.service;

import com.payu.api.BookDto;
import com.payu.entity.BookEntity;
import com.payu.repository.BookRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class BookService {

    @Autowired
    private BookRepository repository;

    @Autowired
    private ConversionService conversionService;

    public List<BookDto> list() {
        return repository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }


    public BookDto add(BookDto dto) {
        BookEntity bookEntity = repository.findById(dto.getId()).orElseGet(() -> {
                    BookEntity entity = new BookEntity();
                    entity.setId(dto.getId());
                    entity.setName(dto.getName());
                    entity.setIsbnNumber(dto.getIsbnNumber());
                    entity.setPrice(dto.getPrice());
                    entity.setPublishDate(dto.getPublishDate());
                    entity.setBookType(dto.getBookType());
                    return entity;
                });

        BookEntity saved = repository.save(bookEntity);
        return convertToDto(saved);
    }

    public BookDto findBook(Long bookId) {
        return repository.findById(bookId).map(this::convertToDto).orElseThrow(EntityNotFoundException::new);
    }

    public List<BookDto> findBookByName(String bookName) {
        if (bookName.isEmpty()) {
            return list();
        }

        return repository.findAllBooksByNameContainingIgnoreCase(bookName).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public BookDto edit(BookDto dto) {
        boolean isPresent = repository.existsById(dto.getId());

        if (isPresent) {
            BookEntity entity = repository.save(convertToEntity(dto));
            return convertToDto(entity);
        }
        throw new EntityNotFoundException("Could not find any book with ID " + dto.getId());
    }

    public void delete(Long bookId) {
        BookEntity bookEntity = repository.findById(bookId).orElseThrow(EntityNotFoundException::new);
        repository.delete(bookEntity);
    }

    private BookDto convertToDto(BookEntity bookEntity) {
        return conversionService.convert(bookEntity, BookDto.class);
    }

    private BookEntity convertToEntity(BookDto bookDto) {
        return conversionService.convert(bookDto, BookEntity.class);
    }
}
