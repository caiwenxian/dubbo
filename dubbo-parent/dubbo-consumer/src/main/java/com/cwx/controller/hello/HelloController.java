package com.cwx.controller.hello;

import com.cwx.api.hello.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description hello
 * @Author cwx
 * @Date 2020/12/29 15:01
 * @Version 1.0
 **/

@RestController
public class HelloController {

    @Autowired
    HelloApi helloApi;

    /**
     * hello
     * @param key
     * @author caiwx
     * @date 2020/12/29 - 15:04
     * @return String
     **/
    @RequestMapping("/hello")
    public String hello(String key) {
        return helloApi.hello(key);
    }
}
