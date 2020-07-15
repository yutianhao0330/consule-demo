package com.yutianhao.sc.yutianhaoconsulprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YutianhaoConsulProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(YutianhaoConsulProvider1Application.class, args);
    }

}
