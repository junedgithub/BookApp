package com.jspiders.springbookapp.repository;

import com.jspiders.springbookapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
 Book findById(int id);

}
