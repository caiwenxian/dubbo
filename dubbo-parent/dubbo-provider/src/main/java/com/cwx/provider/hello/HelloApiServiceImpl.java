package com.cwx.provider.hello;

import com.cwx.api.hello.HelloApi;
import com.cwx.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName HelloApiServiceImpl
 * @Description hello
 * @Author cwx
 * @Date 2020/12/29 11:43
 * @Version 1.0
 **/
@Service
public class HelloApiServiceImpl implements HelloApi {

    @Autowired
    IHelloService helloService;

    public String hello(String key) {
        return helloService.hello(key);
    }
}
