package com.project.week3.BookStoreOnline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="userName")
    private String userName;
    @Column(name="userEmail")
    private String userEmail;
    @Column(name="userPhNo")
    private long userPhNo;
    @Column(name="userStatus")
    private boolean userStatus;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public long getUserPhNo() {
        return userPhNo;
    }
    public void setUserPhNo(long userPhNo) {
        this.userPhNo = userPhNo;
    }
    public boolean isUserStatus() {
        return userStatus;
    }
    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }
}
