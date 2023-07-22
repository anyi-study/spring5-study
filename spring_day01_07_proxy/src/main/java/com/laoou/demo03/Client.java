package com.laoou.demo03;

public class Client {
    public static void main(String[] args) {
//        真是角色
        Host host = new Host();

//        代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        通过调用程序处理来处理我们调用的接口对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();//这里的proxy就是动态生成的，我们并没有写。
        proxy.rent();
    }
}
