package com.bishe.text1.service;


import com.bishe.text1.entities.Users;


public interface UsersService {

    Users findByUsername(String username) ;

    Users login(String username,String password);

    Users register(String username,String password);
}
