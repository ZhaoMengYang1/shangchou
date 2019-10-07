package com.k8101.controller;

import com.k8101.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "id", defaultValue = "1")
    Integer id,Model model) {
        return "forward:/success.jsp";
    }

}
