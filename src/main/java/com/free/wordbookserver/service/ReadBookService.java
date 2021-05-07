package com.free.wordbookserver.service;


import com.free.wordbookserver.domain.Book;
import com.free.wordbookserver.domain.BookExample;
import com.free.wordbookserver.dto.BookDto;
import com.free.wordbookserver.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReadBookService {

    @Resource
    BookMapper bookMapper;


    /**
     * 返回书籍列表
     *
     * @param page
     * @return BookDto.bookList
     */
    public BookDto list(int page) {
        int size = (int) bookMapper.countByExample(null);
        List<Book> books = bookMapper.selectByPage((page - 1) * 10, "10");

        int pages = size / 10 + 1;
        BookDto bookDto = new BookDto();
        bookDto.setBookList(books);
        bookDto.setCode("ok");
        bookDto.setPages(pages);
        return bookDto;
    }


}
