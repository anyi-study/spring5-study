package com.laoou.service;

import com.laoou.UserDao.UserDao;
import com.laoou.UserDao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
