package com.project.week3.BookStoreOnline.service;

import com.project.week3.BookStoreOnline.model.Wallet;

public interface WalletService {

    Wallet addAmount(Wallet wallet);
    void updateWallet(Wallet wallet);
}

