package com.bishe.text1.service;

import com.bishe.text1.dao.UsersDao;
import com.bishe.text1.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {


    UsersDao usersDao;

    @Autowired
    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public Users findByUsername(String username) {
        return usersDao.findByUsername(username);
    }

    @Override
    public Users login(String username, String password) {
        return usersDao.login(username, password);
    }

    @Override
    public int register(String username, String password) {
        return usersDao.register(username, password);
    }
}