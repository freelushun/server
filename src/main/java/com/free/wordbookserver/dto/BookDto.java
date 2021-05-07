package com.free.wordbookserver.dto;

import com.free.wordbookserver.domain.Book;

import java.util.List;

public class BookDto {
    String code;
    int pages;


    List<Book> bookList;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
