package com.example.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.Map;

@Controller
public class PersonController {
    @Autowired
    private SqlSessionTemplate sessionTemplate;

    @RequestMapping("/")
    public String listPeople(Map<String, Object> map) {
        this.sessionTemplate.selectOne("users.test");
        return "main";
    }
    @RequestMapping("/test")
    public String test(Map<String, Object> map) {
        this.sessionTemplate.selectOne("users.test");
        return "main";
    }


}
