package com.bishe.text1.service;


import com.bishe.text1.entities.Users;


public interface UsersService {

    Users findByUsername(String username) ;

    Users login(String username,String password);

    int register(String username,String password);
}
