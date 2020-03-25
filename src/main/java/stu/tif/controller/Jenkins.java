package stu.tif.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
    @GetMapping
    public String test(){
        return "hello jenkins";
    }
}
