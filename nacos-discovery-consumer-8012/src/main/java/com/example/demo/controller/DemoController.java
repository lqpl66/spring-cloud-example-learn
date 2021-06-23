package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.biz.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Value(value = "${server.port}")
    private String port;

    @Autowired
    private DemoService demoService;

    @GetMapping("/port")
    public String getPort() {
        return "port:" + port;
    }

    @PostMapping("/name/{name}")
    public String getName(@PathVariable("name")String name,@RequestBody JSONObject json){
        json.put("name",name);
        return json.toJSONString();
    }

    @GetMapping("/feign/port")
    public String getFeignPort() {
        return demoService.getPort();
    }

    @PostMapping("/feign/name/{name}")
    public String getFeignName(@PathVariable("name")String name,@RequestBody JSONObject json){
        return demoService.getName(name,json);
    }
}
