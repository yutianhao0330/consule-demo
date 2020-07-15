package com.yutianhao.sc.yutianhaoconsulprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YutianhaoConsulProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(YutianhaoConsulProvider2Application.class, args);
    }

}
