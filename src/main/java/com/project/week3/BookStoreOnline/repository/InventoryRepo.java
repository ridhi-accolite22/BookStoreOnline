package com.project.week3.BookStoreOnline.repository;

import java.util.List;

import com.project.week3.BookStoreOnline.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

    @Query("Select i from Inventory i where i.bookName=?1")
    List<Inventory> findInventoryByBookName(String bookName);

    @Query("Select i from Inventory i order by bookLikes desc")
    List<Inventory> findSortedInventoryByBookLikes();

}