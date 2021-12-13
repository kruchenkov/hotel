package com.example.hotel.dao.impl;

import com.example.hotel.dao.DaoException;
import com.example.hotel.dao.UserDao;
import com.example.hotel.dao.mapper.UserMapper;
import com.example.hotel.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public Long create(User user) throws DaoException {
        String sql = "INSERT INTO `user` (`login`, `password`, `role`) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getLogin(), user.getPassword(), user.getRole().ordinal());
        return user.getId();
    }

    @Override
    public User read(Long id) throws DaoException {
        String sql = "SELECT * FROM `user` WHERE id = ?";
        User user = (User) jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserMapper());
        return user;
    }

    @Override
    public List<User> readAll() throws DaoException {
        String sql = "SELECT * FROM `user`";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    @Override
    public void update(User user) throws DaoException {
        String sql = "UPDATE `user` SET login = ?, password = ?, role = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getLogin(), user.getPassword(), user.getRole().ordinal(), user.getId());
        System.out.println("User updated");
    }

    @Override
    public void delete(Long id) throws DaoException {
        String sql = "DELETE FROM `user` WHERE id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("User with id = " + id + " removed");
    }

    @Override
    public User findByLoginAndPassword(String login, String password) throws DaoException {
        return null;
    }
}
