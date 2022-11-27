package com.project.week3.BookStoreOnline.service;

import com.project.week3.BookStoreOnline.model.Inventory;

import java.util.List;

public interface InventoryService {

    Inventory createInventory(Inventory inventory);


    List<Inventory> getInventories();

    List<Inventory> getInventoryByBookName(String bookName);

    List<Inventory> getSortedInventoryByBookLikes();

}
