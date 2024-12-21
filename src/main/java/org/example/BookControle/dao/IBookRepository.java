package org.example.BookControle.dao;

import org.example.BookControle.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {

    List<Book> findBookByTitle(String title);

}
