package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo.class, args);
        BookRepository repo = context.getBean(BookRepository.class);
        repo.save(new Book("Harry Potter and the Sorcerer's Stone", "J.K Rowling"));
        repo.save(new Book("Wings of Fire", "A.P.J Abdul Kalam"));
        List<Book> books = repo.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

