package com.cao26.studyCloud.web;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class StudyController {

//    @Resource
//    CounterService counterService;\
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
//
////         对访问请求的计数方法
//        counterService.increment("Study.hello.count");
       List<ServiceInstance> instances =  client.getInstances("9527");

        for (ServiceInstance in:instances
             ) {
            logger.info("/hello,host:" + in.getHost()+"serviceId:"+in.getInstanceId());

        }
        return "Hello world";
    }
}
