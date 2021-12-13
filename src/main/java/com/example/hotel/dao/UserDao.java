package com.example.hotel.dao;

import com.example.hotel.entity.User;

import java.util.List;

public interface UserDao extends Dao<User>{
    List<User> readAll() throws DaoException;

    User findByLoginAndPassword(String login, String password) throws DaoException;
}
