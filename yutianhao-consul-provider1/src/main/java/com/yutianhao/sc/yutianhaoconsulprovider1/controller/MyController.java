package com.yutianhao.sc.yutianhaoconsulprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: MyController
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 8:50
 */
@RestController
public class MyController {
    @RequestMapping("test")
    public String test(){
        return "hellotest.......";
    }
}
