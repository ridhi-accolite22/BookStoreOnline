package com.project.week3.BookStoreOnline.repository;

import com.project.week3.BookStoreOnline.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;



public interface WalletRepo extends JpaRepository<Wallet, Integer>{

}