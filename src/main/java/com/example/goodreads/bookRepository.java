package com.example.goodreads;

import java.util.*;

public interface bookRepository {
   ArrayList<book> getBook();

   book bookgetId(int bookId);
}