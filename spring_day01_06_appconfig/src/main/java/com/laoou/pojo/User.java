package com.laoou.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component这个注解说明将这个类交给容器管理
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("老罗")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
