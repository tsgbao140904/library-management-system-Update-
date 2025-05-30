package com.library.model.book;

import com.library.model.Book;

public class PrintedBook extends Book {
    public PrintedBook(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public String getType() {
        return "Printed";
    }
}