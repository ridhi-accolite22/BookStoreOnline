package com.project.week3.BookStoreOnline.service;

import com.project.week3.BookStoreOnline.model.Transaction;

import java.util.List;



public interface TransactionService {

    Transaction createTransactionBorrow(int classId, Transaction transaction);

    //Transaction createTransactionReturn(Transaction transaction);

    List<Transaction> getUserTransactions(int userId);

}
