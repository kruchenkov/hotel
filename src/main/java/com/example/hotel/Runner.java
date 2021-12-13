package com.example.hotel;

import com.example.hotel.dao.DaoException;
import com.example.hotel.dao.UserDao;
import com.example.hotel.dao.impl.UserDaoImpl;
import com.example.hotel.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws DaoException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/jdbc-context-xml.xml");
        UserDao userDao = ctx.getBean("userDao", UserDaoImpl.class);

        User user;

        List<User> users = userDao.readAll();
        for (User user1 : users) {
            System.out.println(user1);
        }

        user = userDao.findByLoginAndPassword("John", "1234");
        System.out.println(user);
    }
}
