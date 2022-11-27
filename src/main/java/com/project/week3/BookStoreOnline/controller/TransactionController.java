package com.project.week3.BookStoreOnline.controller;

import java.util.Date;
import java.util.List;

import com.project.week3.BookStoreOnline.exceptions.NoObjectFoundException;
import com.project.week3.BookStoreOnline.model.Transaction;
import com.project.week3.BookStoreOnline.service.TransactionService;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@EnableTransactionManagement
@RestController

public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/borrow/{classId}")
    private ResponseEntity<Transaction> borrowBook(@PathVariable int classId, @RequestBody Transaction transaction)
    {
        try {
            System.out.println(transaction);
            return ResponseEntity.ok().body(this.transactionService.createTransactionBorrow(classId, transaction));
        }
        catch (Exception e) {
            throw new NoObjectFoundException("Check inputs!");
        }
    }
    @GetMapping("/transaction/{userId}")
    private ResponseEntity<List<Transaction>> getTransactions(@PathVariable int userId)
    {
        return ResponseEntity.ok().body(this.transactionService.getUserTransactions(userId));
    }
}