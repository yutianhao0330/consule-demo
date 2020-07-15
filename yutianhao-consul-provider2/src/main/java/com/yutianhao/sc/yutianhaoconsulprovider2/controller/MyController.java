package com.yutianhao.sc.yutianhaoconsulprovider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thyu
 * @title: MyController
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 13:56
 */
@RestController
public class MyController {
    @RequestMapping("test")
    public String test(){
        return "hello222test.......";
    }
}
