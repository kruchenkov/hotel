package com.example.hotel.service;

import com.example.hotel.dao.DaoException;
import com.example.hotel.dao.UserDao;
import com.example.hotel.dao.impl.UserDaoImpl;
import com.example.hotel.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() throws ServiceException {
        try {
            return userDao.readAll();
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public User findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public void saveUser(User user) throws ServiceException {

    }

    @Override
    public User login(String login, String password) throws ServiceException {
        return null;
    }

    @Override
    public void delete(List<Long> ids) throws ServiceException {

    }
}
