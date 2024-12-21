package org.example.BookControle.service;


import lombok.AllArgsConstructor;
import org.example.BookControle.dao.IBookRepository;
import org.example.BookControle.dto.BookDTO;
import org.example.BookControle.entities.Book;
import org.example.BookControle.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements  IBookService{


    private IBookRepository iBookRepository;
    private BookMapper bookMapper;


    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.fromBookDtoToBook(bookDTO);
        return bookMapper.fromBookToBookDto(iBookRepository.save(book));
    }

    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<Book> booksByTitle = iBookRepository.findBookByTitle(title);
        return bookMapper.fromListBookToListBookDto(booksByTitle);
    }
}
