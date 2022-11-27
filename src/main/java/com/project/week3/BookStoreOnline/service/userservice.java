package com.project.week3.BookStoreOnline.service;

import java.util.List;

import com.project.week3.BookStoreOnline.model.User;


public interface userservice {

    User createUser(User user);

    User updateUser(User user);

    List<User> getUsers();

    User suspendUserById(int userid);

}