package org.goskyer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by galaxy on 2017/3/3.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String hello(){
        return "hello programmer";
    }

}
