package com.laoou.UserDao;

public class UserMysqlDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql获取数据");
    }
}
