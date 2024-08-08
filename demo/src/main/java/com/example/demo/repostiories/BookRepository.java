package com.example.demo.repostiories;

import com.example.demo.Author;
import com.example.demo.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {



}

