package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>,PagingAndSortingRepository<Book,Long> {

}
