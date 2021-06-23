package com.example.demo.Biz;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "nacos-dis-provider")
public interface DemoService {

    @GetMapping(value = "/nacos-dis/port")
    String getPort();

    @PostMapping(value = "/nacos-dis/name/{name}")
    String getName(@PathVariable("name")String name, @RequestBody JSONObject json);

}
