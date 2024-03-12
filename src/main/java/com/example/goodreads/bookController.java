package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
import com.example.goodreads.bookservice;

@RestController
public class bookController {
    bookservice bs = new bookservice();

    @GetMapping("/books")
    public ArrayList<book> getBook() {
        return bs.getBook();
    }

    @GetMapping("/books/{bookId}")
    public book bookgetId(@PathVariable("bookId") int bookId) {
        
        return bs.bookgetId(bookId);
    }
}
