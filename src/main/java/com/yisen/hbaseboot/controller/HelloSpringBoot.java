package com.yisen.hbaseboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping("/hello")
    public String test(){

        return "Hello SpringBoot2";
    }
}
