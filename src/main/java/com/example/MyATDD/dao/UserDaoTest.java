package com.example.MyATDD.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao);
    }

}
