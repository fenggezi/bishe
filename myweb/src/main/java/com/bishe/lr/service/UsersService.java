package com.bishe.lr.service;


import com.bishe.lr.entities.Users;


public interface UsersService {

    Users findByUsername(String username) ;

    Users login(String username,String password);

    int register(String username,String password);
}
