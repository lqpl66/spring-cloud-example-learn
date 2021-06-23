package com.example.demo.constant.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ServerPathConfig {

    @Value(value = "${nacos.provider}")
    private String nacosProviderPath;
}
