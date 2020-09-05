package com.imooc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by ljd on 2020/9/5.
 */
@RestController
public class Hello {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot!";
    }
}
