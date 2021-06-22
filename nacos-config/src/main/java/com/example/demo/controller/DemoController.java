package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@RefreshScope
public class DemoController {

    @Value(value = "${name}")
    private String name;

    @Value(value = "${profile.name}")
    private String profilesName;

    @Value(value = "${group.name}")
    private String groupName;

    @Value(value = "${share.name}")
    private String shareName;

    @GetMapping("/name")
    public String getName(){
        return name+";"+profilesName+";"+groupName;
    }

    @GetMapping("/share")
    public String getShareName(){
        return shareName+";";
    }
}
