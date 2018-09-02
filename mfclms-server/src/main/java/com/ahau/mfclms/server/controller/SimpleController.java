package com.ahau.mfclms.server.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  11:08 2018/7/14
 */
@RestController
public class SimpleController {

    {
        System.out.println("Controller 加载中......");
    }

    @RequestMapping("/simple")
    public String somple(){
        return "simple";
    }

}
