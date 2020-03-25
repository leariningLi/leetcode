package com.example.haier.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qdtan on 2019/12/12.
 */
@RestController
@RequestMapping("/api")
public class DemoController {
    @RequestMapping("/getInfo")
    public String getInfo(){
        return "success";
    }
}
