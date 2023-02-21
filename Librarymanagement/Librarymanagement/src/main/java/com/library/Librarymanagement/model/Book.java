package com.library.Librarymanagement.model;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookname;
    private String author;
    private Integer price;
}
