package com.example.hotel.dao.impl;

import com.example.hotel.dao.DaoException;
import com.example.hotel.dao.UserDao;
import com.example.hotel.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {



    @Override
    public Long create(User entity) throws DaoException {
        return null;
    }

    @Override
    public User read(Long id) throws DaoException {
        return null;
    }

    @Override
    public void update(User entity) throws DaoException {

    }

    @Override
    public void delete(Long id) throws DaoException {

    }

    @Override
    public List<User> readAll() throws DaoException {
        return null;
    }

    @Override
    public User findByLoginAndPassword(String login, String password) throws DaoException {
        return null;
    }
}
