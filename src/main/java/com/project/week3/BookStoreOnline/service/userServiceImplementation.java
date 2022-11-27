package com.project.week3.BookStoreOnline.service;

import java.util.List;
import java.util.Optional;

import com.project.week3.BookStoreOnline.exceptions.NoObjectFoundException;
import com.project.week3.BookStoreOnline.model.User;
import com.project.week3.BookStoreOnline.model.Wallet;
import com.project.week3.BookStoreOnline.repository.UserRepo;
import com.project.week3.BookStoreOnline.repository.WalletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class userServiceImplementation implements userservice{

    @Autowired
    private UserRepo userrepo;
    @Autowired
    private WalletRepo walletrepo;
    @Autowired
    private Wallet wallet;
    public User createUser(User user)
    {
        user.setUserStatus(true);
        User userAdded=userrepo.save(user);
        wallet.setDefaultBalance();
        wallet.setUserId(user.getUserId());
        walletrepo.save(wallet);
        return userAdded;
    }
    public User updateUser(User user)
    {
        Optional<User> userObj=this.userrepo.findById(user.getUserId());

        if(userObj.isPresent())
        {
            User userUpdate=userObj.get();
            //userrepo.updateUserByID(user.getUserName(),user.getUserEmail(),user.getUserPhNo(),user.getUserId());
            userUpdate.setUserId(user.getUserId());
            userUpdate.setUserName(user.getUserName());
            userUpdate.setUserEmail(user.getUserEmail());
            userUpdate.setUserPhNo(user.getUserPhNo());
            userrepo.save(userUpdate);
            return userUpdate;

        }
        else
        {
            throw new NoObjectFoundException("No user with ID : "+user.getUserId());
        }
    }

    public List<User> getUsers()
    {
        return this.userrepo.findAll();
    }


    public User suspendUserById(int userid)
    {
        Optional<User> userObj=this.userrepo.findById(userid);

        if(userObj.isPresent())
        {
            User userSuspend=userObj.get();
            userSuspend.setUserStatus(false);
            userrepo.save(userSuspend);
            return userSuspend;
        }
        else
        {
            throw new NoObjectFoundException("No user with ID : "+userid);
        }
    }


}
