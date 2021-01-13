package com.zwj.distributed.provider.dubbodemo.service.impl;

import com.zwj.distributed.provider.dubbodemo.service.IDubboDemo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zwj * @since 1.0
 */
@DubboService(version = "1.0.0")
public class DubboDemoImpl implements IDubboDemo {

    @Value("dubbo.application.name")
    private String applicationName;

    @Override
    public String sayHello() {
        return "hello! --" + applicationName;
    }
}
