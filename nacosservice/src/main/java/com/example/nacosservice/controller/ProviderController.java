package com.example.nacosservice.controller;

import com.example.nacosservice.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * provider controller
 *
 * @author Dylan
 * @Date 2024/1/25-16:25
 */
@RestController
public class ProviderController {
    @Autowired
    private MyConfiguration configuration;
    @RequestMapping("/test")
    public String provide() {
        return configuration.getNamespace() + ":" + configuration.getServerAddr();
    }
}