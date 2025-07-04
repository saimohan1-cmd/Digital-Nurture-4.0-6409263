package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    public Book() {}
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return id + ": " + title + " by " + author;
    }
}
