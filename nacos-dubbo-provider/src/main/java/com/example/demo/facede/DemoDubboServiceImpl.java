package com.example.demo.facede;

import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoDubboServiceImpl implements DemoDubboService {

    @Override
    public String getTest(String param) {
        return "param:" + param;
    }
}
