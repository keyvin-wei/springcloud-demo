package com.keyvin.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试A
 * @author weiwh
 * @date 2019/11/8 15:01
 */
@RestController
public class AController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(@RequestParam String name){
        return "a controller，参数："+name+"，端口号：" + port;
    }

}
