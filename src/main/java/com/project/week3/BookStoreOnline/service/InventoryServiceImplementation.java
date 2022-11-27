package com.project.week3.BookStoreOnline.service;

import java.util.List;

import javax.transaction.Transactional;

import com.project.week3.BookStoreOnline.model.Book;
import com.project.week3.BookStoreOnline.model.Inventory;
import com.project.week3.BookStoreOnline.repository.BookRepo;
import com.project.week3.BookStoreOnline.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class InventoryServiceImplementation implements InventoryService{
    @Autowired
    private InventoryRepo inventoryrepo;
    @Autowired
    private BookRepo bookrepo;
    public Inventory createInventory(Inventory inv)
    {
        Inventory inventoryAdded=inventoryrepo.save(inv);
        for(int i=0;i<inventoryAdded.getBookCount();i++)
        {
            Book book=new Book();
            book.setClassId(inventoryAdded.getClassId());
            bookrepo.save(book);
            System.out.println(book);
        }
        return inventoryAdded;
    }
    public List<Inventory> getInventories()
    {
        return this.inventoryrepo.findAll();
    }
    public List<Inventory> getInventoryByBookName(String bookName)
    {
        List<Inventory> bookList=inventoryrepo.findInventoryByBookName(bookName);
        for (Inventory inventory : bookList) {
            if(inventory.getBookCount()==0)
                System.out.println("BOOK "+ inventory.getClassId()+" OUT OF STOCK");
        }
        return bookList;
    }
    public List<Inventory> getSortedInventoryByBookLikes()
    {
        return inventoryrepo.findSortedInventoryByBookLikes();
    }
}
