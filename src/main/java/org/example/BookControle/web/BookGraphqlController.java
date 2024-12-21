package org.example.BookControle.web;


import lombok.AllArgsConstructor;
import org.example.BookControle.dto.BookDTO;
import org.example.BookControle.service.IBookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphqlController {

    private IBookService iBookService;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO bookDTO){
        return iBookService.saveBook(bookDTO);
    }


    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title){
        return iBookService.getBookByTitle(title);
    }


}
