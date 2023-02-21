package com.library.Librarymanagement.service;

import com.library.Librarymanagement.model.Book;
import com.library.Librarymanagement.repository.Bookrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Bookservice
{
    private final Bookrepository bookrepo;

    public Book addbook(Book book)
    {
        return this.bookrepo.save(book);
    }
    public List<Book> getallbooks()
    {
        return this.bookrepo.findAll();
    }
     public String deletebook(Long id)
     {
         this.bookrepo.deleteById(id);
         return "deleted successfully";
     }

     public void updatebook(Long id, Book book)
     {
         Book book1 = this.bookrepo.findById(id).get();
         book1.setBookname(book.getBookname());
         book1.setAuthor(book.getAuthor());
         book1.setPrice(book.getPrice());
         this.bookrepo.save(book1);
     }

     public Book getsingledetails(Long id)
     {
         return this.bookrepo.findById(id).get();
     }
}
