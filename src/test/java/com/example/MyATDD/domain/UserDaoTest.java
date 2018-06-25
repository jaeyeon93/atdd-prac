package com.example.MyATDD.domain;

import com.example.MyATDD.dao.JavaConfig;
import com.example.MyATDD.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class UserDaoTest {
    private UserDao dao;
    private User user;

    @Test
    public void addAndGet() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        User user1 = new User("1", "test1","password");
        User user2 = new User("2", "test2","password");
        User user3 = new User("3", "test3","password");

        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.add(user1);
        dao.add(user2);
        assertThat(dao.getCount(), is(2));

        User userget1 = dao.get(user2.getId());
        assertThat(userget1.getName(), is(user2.getName()));
        assertThat(userget1.getPassword(), is(user2.getPassword()));
    }

}
