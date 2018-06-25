package com.example.MyATDD.domain;

import com.example.MyATDD.dao.JavaConfig;
import com.example.MyATDD.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class UserDaoTest {

    @Test
    public void addAndGet() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserDao dao = context.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId("1");
        user.setName("jaeyeon");
        user.setPassword("1234");
        System.out.println(user.toString());
        dao.add(user);

        User user2 = dao.get(user.getId());
        System.out.println("user2 : " + user2.toString());
        assertThat(user2.getName(), is(user.getName()));
        assertThat(user2.getPassword(), is(user.getPassword()));
    }
}
