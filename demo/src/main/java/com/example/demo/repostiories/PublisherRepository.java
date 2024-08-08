package com.example.demo.repostiories;

import com.example.demo.Book;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Book, Long> {


}

