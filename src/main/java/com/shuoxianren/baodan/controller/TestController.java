package com.shuoxianren.baodan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class Name: com.shuoxianren.baodan.controller.TestController
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 10:59
 * Description: TestController
 * ==================================
 */
@Controller
public class TestController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "hello";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/index")
    public String index() {
        System.out.println(111);
        return "index";
    }

}
