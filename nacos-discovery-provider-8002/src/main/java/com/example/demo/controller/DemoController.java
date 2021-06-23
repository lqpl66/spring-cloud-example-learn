package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort() {
        return "port:" + port;
    }

    @PostMapping("/name/{name}")
    public String getName(@PathVariable("name")String name,@RequestBody JSONObject json){
        json.put("name",name);
        return json.toJSONString();
    }
}
