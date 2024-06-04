package cn.liu.controller;

import cn.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public String test(){
        System.out.println(userService.findById(1));
        return "success";
    }
}
