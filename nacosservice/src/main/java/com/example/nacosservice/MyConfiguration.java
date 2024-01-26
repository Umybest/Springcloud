package com.example.nacosservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author Dylan
 * @Date 2024/1/25-16:27
 */
@Data
@Component
@ConfigurationProperties("spring.cloud.nacos.discovery")
public class MyConfiguration {
    private String serverAddr;
    private String namespace;

}