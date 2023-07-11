package com.javalab.board.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    // 어플리케이션 처음 구동시 호출되는 메소드("/")
    @GetMapping("/")
    public String Main() {
        return "main/main";	//
    }
    
    @GetMapping("/guide") 
    public String guide() {
    	return "main/guide";
    }
    


}
