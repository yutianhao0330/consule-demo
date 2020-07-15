package com.yutianhao.sc.yutianhaoconsulconsumer1;

import com.yutianhao.sc.yutianhaoconsulconsumer1.config.BalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name="providerName",configuration = {BalanceConfig.class})
public class YutianhaoConsulConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(YutianhaoConsulConsumer1Application.class, args);
    }

}
