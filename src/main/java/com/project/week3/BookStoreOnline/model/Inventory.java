package com.project.week3.BookStoreOnline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name="classId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId;
    @Column(name="bookName")
    private String bookName;
    @Column(name="bookAuthor")
    private String bookAuthor;
    @Column(name="bookPrice")
    private int bookPrice;
    @Column(name="bookCategory")
    private String bookCategory;
    @Column(name="bookCount")
    private int bookCount;
    @Column(name="countLikes")
    private int bookLikes=0;

    public Integer getClassId() {
        return classId;
    }
    public void setClassId(Integer classId) {
        this.classId = classId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public int getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
    public String getBookCategory() {
        return bookCategory;
    }
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    public int getBookLikes() {
        return bookLikes;
    }
    public void setBookLikes(int bookLikes) {
        this.bookLikes = bookLikes;
    }

}
