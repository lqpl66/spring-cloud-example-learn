package com.example.demo.biz;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.constant.config.ServerPathConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * path =server.servlet.context-path保持一致，
 * controller也可配置
 */
@FeignClient(value = "nacos-dis-provider",path = "/nacos-dis")
public interface DemoService {


    @GetMapping(value = "/port")
    String getPort();

    @PostMapping(value = "/name/{name}")
    String getName(@PathVariable("name")String name, @RequestBody JSONObject json);

}
