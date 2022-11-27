package com.project.week3.BookStoreOnline.repository;

import com.project.week3.BookStoreOnline.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;



public interface UserRepo extends JpaRepository<User, Integer>{


}
