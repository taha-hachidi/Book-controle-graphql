package org.example.BookControle.service;

import org.example.BookControle.dto.BookDTO;

import java.util.List;

public interface IBookService {


    BookDTO saveBook(BookDTO bookDTO);

    List<BookDTO> getBookByTitle(String title);
}
