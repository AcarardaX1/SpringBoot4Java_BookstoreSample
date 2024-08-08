package com.example.demo.bootstrap;

import com.example.demo.Author;
import com.example.demo.Book;
import com.example.demo.repostiories.AuthorRepository;
import com.example.demo.repostiories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Author Eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123");
        Eric.getBooks().add(ddd);
        ddd.getAuthors().add(Eric);


        authorRepository.save(Eric);
        bookRepository.save(ddd);

        Author Rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "987");
        Rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(Rod);

        authorRepository.save(Rod);
        bookRepository.save(noEJB);


        System.out.println("Started in Bookstrap");
        System.out.println("Number of Books:" + bookRepository.count());
    }
}


