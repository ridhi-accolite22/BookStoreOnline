package com.project.week3.BookStoreOnline.repository;

import com.project.week3.BookStoreOnline.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book, Integer>{

}