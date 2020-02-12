package com.lr.travel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//controller 允许类接收前端请求
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";}

    }

