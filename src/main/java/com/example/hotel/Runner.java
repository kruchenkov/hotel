package com.example.hotel;

import com.example.hotel.dao.DaoException;
import com.example.hotel.dao.UserDao;
import com.example.hotel.dao.impl.UserDaoImpl;
import com.example.hotel.entity.User;
import com.example.hotel.service.ServiceException;
import com.example.hotel.service.UserService;
import com.example.hotel.service.impl.UserServiceImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws DaoException, ServiceException {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("/jdbc-context-xml.xml", "/service-context-xml.xml");
        UserDao userDao = ctx.getBean("userDao", UserDaoImpl.class);
        UserService userService = ctx.getBean("userService", UserServiceImpl.class);
        /*
         * wefwefwe
         * fwe
         * fw
         * ef
         * we
         * f
         * we
         * f
         *
         *
         *
         *
         * */
        User user;

        List<User> users = userService.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }

        System.out.println("\n");
        user = userService.login("John", "1234");
        System.out.println(user);
    }
}
