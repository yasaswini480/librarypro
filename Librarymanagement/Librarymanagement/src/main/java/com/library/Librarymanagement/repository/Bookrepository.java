package com.library.Librarymanagement.repository;

import com.library.Librarymanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Long>
{

}
