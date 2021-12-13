package com.example.hotel.servlet.user;

import com.example.hotel.service.UserService;
import com.example.hotel.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServlet;

public class UserListController extends HttpServlet {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
