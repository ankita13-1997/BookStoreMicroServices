package com.microusers.bookservice.service;



import com.microusers.bookservice.dto.BookDto;
import com.microusers.bookservice.model.BookDetailsModel;

import java.util.List;

public interface IBookService {
    BookDetailsModel addBook(BookDto bookDto);

    List<BookDetailsModel> showAllBooks();

    List<BookDetailsModel> showBookHigherToLower();

    List<BookDetailsModel> showBookLowerToHigher();

    List<BookDetailsModel> showBookNewLaunch();

    int getCountOfBooks();
}
