package com.cwx.service.impl;

import com.cwx.service.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @ClassName HelloServiceImpl
 * @Description hello
 * @Author cwx
 * @Date 2020/12/29 11:43
 * @Version 1.0
 **/
@Service
@Slf4j
public class HelloServiceImpl implements IHelloService {

    public String hello(String key) {
        return StringUtils.isEmpty(key) ? "message from provider" : key;
    }
}
