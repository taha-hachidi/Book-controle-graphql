package org.example.BookControle;

import org.example.BookControle.dao.IBookRepository;
import org.example.BookControle.entities.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleGraphqlApplication.class, args);
	}


	CommandLineRunner initData(IBookRepository bookRepository) {
		return args -> {
			bookRepository.save(new Book(1, "OnePunchMan", "Author1", "Genre1", 19.99, "1234567890"));
			bookRepository.save(new Book(2, "LeMondeDeSofie", "Author2", "Genre2", 15.99, "0987654321"));
			bookRepository.save(new Book(3, "99jours", "Author3", "Genre3", 25.99, "1122334455"));
			bookRepository.save(new Book(4, "LaCoupe", "Author4", "Genre4", 12.99, "6677889900"));
		};
	}

}
