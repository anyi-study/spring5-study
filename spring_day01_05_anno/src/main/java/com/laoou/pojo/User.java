package com.laoou.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component组件 等价于xml配置的bean
@Component
public class User {
//    @Value("laoou")
    public String name;

    @Value("laoou")
    public void setName(String name) {
        this.name = name;
    }
}
