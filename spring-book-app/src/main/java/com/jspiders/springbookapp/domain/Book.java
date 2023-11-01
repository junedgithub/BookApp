package com.jspiders.springbookapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book_info")
@Entity
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "book_id")
   int bookId;

   @Column(name = "book_name")
   String bookName;

   @Column(name = "book_price")
   double bookPrice;

   @Column(name = "category")
   String category;
}
