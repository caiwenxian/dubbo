package com.cwx.config;

import com.cwx.api.hello.HelloApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DubboProviderConfig
 * @Description dubbo provider配置
 * @Author cwx
 * @Date 2020/12/29 14:50
 * @Version 1.0
 **/

@Configuration
public class DubboProviderConfig {

    private static final String DUBBO_PROVIDER_VERSION = "1.0.0";

    @Reference(version = DUBBO_PROVIDER_VERSION)
    private HelloApi helloApi;

//    @Bean
//    public HelloApi HelloApi() {
//        return helloApi;
//    }



}
