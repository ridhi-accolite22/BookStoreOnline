package com.project.week3.BookStoreOnline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @Column(name="transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;
    @Column(name="userId")
    private int userId;
    @Column(name="bookId")
    private int bookId;
    @Column(name="deposit")
    private int deposit;
    @CreationTimestamp
    @Column(name="borrowedTime")
    private Date dateBorrowed;
    @Column(name="returnedTime")
    private Date dateReturned;
    @Column(name="refundBalance")
    private int refundBalance;
    public long getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getDeposit() {
        return deposit;
    }
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    public Date getDateBorrowed() {
        return dateBorrowed;
    }
    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }
    public Date getDateReturned() {
        return dateReturned;
    }
    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }
    public int getRefundBalance() {
        return refundBalance;
    }
    public void setRefundBalance(int refundBalance) {
        this.refundBalance = refundBalance;
    }
    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", userId=" + userId + ", bookId=" + bookId
                + ", deposit=" + deposit + ", dateBorrowed=" + dateBorrowed + ", dateReturned=" + dateReturned
                + ", refundBalance=" + refundBalance + "]";
    }

}
