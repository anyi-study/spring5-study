package com.laoou.demo01;

public class Client {
    public static void main(String[] args) {
//        房东出租房子
        Host host = new Host();
//        代理,中介帮房东出租,但是代理一般会有附属操作.
        Proxy proxy = new Proxy(host);
//        无需面对房东,直接找中介
        proxy.rent();
    }
}
