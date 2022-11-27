package com.project.week3.BookStoreOnline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="wallet")
public class Wallet {
    @Id
    @Column(name="walletId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int walletId;
    @Column(name="userId")
    private int userId;
    @Column(name="balance")
    private int balance;
    public int getWalletId() {
        return walletId;
    }
    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setDefaultBalance()
    {
        this.balance=500;
    }
    public void addAmount(int amount)
    {
        this.balance+=amount;
    }

}

