package com.bishe.lr.entities;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String gender;
    private  int age;

}
