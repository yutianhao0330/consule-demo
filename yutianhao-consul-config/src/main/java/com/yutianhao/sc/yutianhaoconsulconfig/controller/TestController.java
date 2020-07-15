package com.yutianhao.sc.yutianhaoconsulconfig.controller;

import com.yutianhao.sc.yutianhaoconsulconfig.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: TestController
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 15:08
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${myNameKey:defaultName}")
    private String myName;
    @Autowired
    private MyConfig myConfig;

    @RequestMapping("testKey")
    public String test(){
        return myName;
    }

    @RequestMapping("testMyConfig")
    public MyConfig testMyConfig(){
        return myConfig;
    }
}
