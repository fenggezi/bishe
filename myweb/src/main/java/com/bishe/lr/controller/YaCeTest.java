package com.bishe.lr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class YaCeTest {

    @GetMapping("/yace")
    public List<String> addNum(){
        List list = new ArrayList();

        list.add(UUID.randomUUID().toString().substring(0,5));
        System.out.println(1);
        return list;
    }

}
