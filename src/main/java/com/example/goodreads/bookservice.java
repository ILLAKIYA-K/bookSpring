package com.example.goodreads;

import java.util.*;
import com.example.goodreads.bookRepository;


public class bookservice implements bookRepository {
    private HashMap<Integer, book> hmap = new HashMap<>();

    public bookservice() {
        book b1 = new book(1, "harryPotter", "imageHarryPotter.url");
        book b2 = new book(2, "My life with the walter boys", "image.url");
        book b3 = new book(3,"13 reasons why","gh.url");
        book b4 = new book(4,"anne with an e","p.url");
        book b5 = new book(5,"Breaking bad ","ksh.url");

        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
        hmap.put(b3.getId(), b3);
        hmap.put(b4.getId(), b4);
        hmap.put(b5.getId(), b5);
    }

    @Override
    public ArrayList<book> getBook() {
        Collection<book> bkCollection = hmap.values();
        ArrayList<book> Bk = new ArrayList<>(bkCollection);
        return Bk;

    }

    public book bookgetId(int bookId) {
        book bg = hmap.get(bookId);
        
        return bg;

    }
}