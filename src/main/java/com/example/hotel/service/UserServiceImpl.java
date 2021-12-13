package com.example.hotel.service;

import com.example.hotel.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> findAll() throws ServiceException {
        return null;
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
