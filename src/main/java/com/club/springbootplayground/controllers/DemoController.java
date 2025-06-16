package com.club.springbootplayground.controllers;

import com.club.springbootplayground.services.DemoService;
import com.club.springbootplayground.services.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class DemoController {

    // This is a field injection of the DemoService
//    @Autowired
    IDemoService demoService;

//  This is a constructor injection of the DemoService
    public DemoController(IDemoService demoService) {
        this.demoService = demoService;
        System.out.println(demoService.getClass().getName());
    }


    @GetMapping
    public String demo(){
       return "Hello World from Controller!!";
    }

}
