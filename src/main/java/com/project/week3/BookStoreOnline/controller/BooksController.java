package com.project.week3.BookStoreOnline.controller;

import java.util.List;

import com.project.week3.BookStoreOnline.model.Inventory;
import com.project.week3.BookStoreOnline.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {
    @Autowired
    private InventoryService invService;

    @GetMapping("/allbooks")
    private ResponseEntity<List<Inventory>> getAllInventories()
    {
        return ResponseEntity.ok().body(this.invService.getInventories());
    }
    @PostMapping("/addbooks")
    private ResponseEntity<Inventory> saveInventories(@RequestBody Inventory inv)
    {
        try {
            return ResponseEntity.ok().body(this.invService.createInventory(inv));
        } catch (Exception e) {
            System.out.println("Check the inputs... "+e.getStackTrace());
        }
        return null;
    }
    @GetMapping("/books/{bookName}")
    private ResponseEntity<List<Inventory>> getInventoryByBookName(@PathVariable String bookName)
    {
        return ResponseEntity.ok().body(this.invService.getInventoryByBookName(bookName));
    }
    @GetMapping("/books/sortbylikes")
    private ResponseEntity<List<Inventory>> getSortedInventoryLikes()
    {
        return ResponseEntity.ok().body(this.invService.getSortedInventoryByBookLikes());
    }

}
