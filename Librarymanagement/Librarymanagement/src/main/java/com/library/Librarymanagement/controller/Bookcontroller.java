package com.library.Librarymanagement.controller;

import com.library.Librarymanagement.model.Book;
import com.library.Librarymanagement.service.Bookservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Bookcontroller
{
    private final Bookservice bookservice;
    @PostMapping("/add")
    public Book addbook(@RequestBody Book book)
    {
        return this.bookservice.addbook(book);
    }
    @GetMapping("/allbooks")
    public List<Book> getallbooks()
    {
        return this.bookservice.getallbooks();
    }
    @DeleteMapping("/delete/{id}")
    public String deletebook(@PathVariable Long id)
    {
        return this.bookservice.deletebook(id);
    }
    @PutMapping("/update/{id}")
    public void updatebook(@PathVariable Long id, @RequestBody Book book)
    {
        this.bookservice.updatebook(id, book);
    }
    @GetMapping("/book/{id}")
    public Book getsingledetails(@PathVariable Long id)
    {
        return  this.bookservice.getsingledetails(id);
    }

}
