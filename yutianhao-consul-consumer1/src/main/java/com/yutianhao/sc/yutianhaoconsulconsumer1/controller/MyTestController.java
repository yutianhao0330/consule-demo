package com.yutianhao.sc.yutianhaoconsulconsumer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author thyu
 * @title: MyTestController
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 9:31
 */
@RestController
public class MyTestController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("services")
    public List<String> getServices(){
        List<String> services = discoveryClient.getServices();
        return services;
    }
    @RequestMapping("getService")
    public List<ServiceInstance> getService(){
        List<ServiceInstance> providerList = discoveryClient.getInstances("providerName");
        return providerList;
    }
    @RequestMapping("callService")
    public String callService(){
        List<ServiceInstance> providerList = discoveryClient.getInstances("providerName");
        if(null!=providerList && providerList.size()>0){
            ServiceInstance instance = providerList.get(0);
            RestTemplate template = new RestTemplate();
            String result = template.getForObject(instance.getUri().toString() + "/test", String.class);
            return result;
        }
        return "no service.....";
    }
    @RequestMapping("balanceCall")
    public String balanceCall(){
        //随机获取一个资源
        ServiceInstance instance = loadBalancerClient.choose("providerName");
        //获取资源地址
        String url = instance.getUri().toString() + "/test";

        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url, String.class);
        System.out.println(result);
        return result;
    }
}
