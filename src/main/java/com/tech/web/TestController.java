package com.tech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author ys
 * @Date 2023/12/26 13:12
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("Reactive on " + Thread.currentThread());
        return "Success";
    }

}
