package com.project.week3.BookStoreOnline.repository;

import java.util.List;

import com.project.week3.BookStoreOnline.model.Book;
import com.project.week3.BookStoreOnline.model.Inventory;
import com.project.week3.BookStoreOnline.model.Transaction;
import com.project.week3.BookStoreOnline.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface TransactionRepo extends JpaRepository<Transaction, Long>{

    @Query("Select t from Transaction t where t.userId=?1")
    List<Transaction> findTransactionByUserId(int userId);

    @Query("Select t.balance from Wallet t where t.userId=?1")
    int findWalletBalanceByUserId(int userId);


    @Query("Select t from Wallet t where t.userId=?1")
    Wallet findWalletByUserId(int userId);

    @Query("Select b.classId from Book b where b.bookId=?1")
    int findClassIdByBookId(int bookId);

    @Query("Select i from Inventory i where i.classId=?1")
    Inventory findInventoryByClassId(int classId);

    @Query("Select b.bookId from Book b where b.classId=?1")
    int findBookIdByClassId(int classId);

    //@Query("update Inventory i set i.bookCount=?2 where i.classId=?1")
    //int decrementBookCount(int classId);
//
//	@Query("Select b from Book b where b.classId=?1")
//	List<Book> findBookByClassId(int classId);
    @Query("Select b from Book b where b.classId=?1")
    List<Book> findBookByClassId(int classId);

}
