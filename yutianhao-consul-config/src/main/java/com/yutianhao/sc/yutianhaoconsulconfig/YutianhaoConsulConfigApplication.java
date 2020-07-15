package com.yutianhao.sc.yutianhaoconsulconfig;

import com.yutianhao.sc.yutianhaoconsulconfig.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({MyConfig.class})
public class YutianhaoConsulConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(YutianhaoConsulConfigApplication.class, args);
    }

}
