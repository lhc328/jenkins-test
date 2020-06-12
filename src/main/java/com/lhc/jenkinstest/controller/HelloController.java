package com.lhc.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HongchaoLv
 * @Description:
 * @Date: Created in 11:45 2020/6/12
 * @Modified By:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String helloWorld() {
        return "hello world";
    }

    @PostMapping("/world")
    public String helloHack() {
        return "fuck off";
    }

    @GetMapping("/nice")
    public String nicejob() {
        return "nice";
    }
}
