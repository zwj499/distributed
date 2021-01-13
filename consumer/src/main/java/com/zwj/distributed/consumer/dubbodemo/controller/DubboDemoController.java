package com.zwj.distributed.consumer.dubbodemo.controller;

import com.zwj.distributed.consumer.dubbodemo.service.IDubboDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwj * @since 1.0
 */
@RestController
@RequestMapping("/demo")
public class DubboDemoController {

    @DubboReference
    private IDubboDemoService dubboDemoService;

    @GetMapping("/hello")
    public String sayHello() {
        return "consumer : " + dubboDemoService.sayHello();
    }

}
