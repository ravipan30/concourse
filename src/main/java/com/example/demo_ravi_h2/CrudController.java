package com.example.demo_ravi_h2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @GetMapping("/")
    public String m1(){
        return "Hi This is sample project";
    }
}
