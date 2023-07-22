package com.laoou.demo02;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add方法");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete 方法");
        userService.delete();
    }

    @Override
    public void update() {
        log("update 方法");
        userService.update();
    }

    @Override
    public void query() {
        log("query 方法");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("添加日志:" + msg);
    }
}
