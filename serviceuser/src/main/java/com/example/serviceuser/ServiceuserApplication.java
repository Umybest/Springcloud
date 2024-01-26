package com.example.serviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.cloud.netflix.eureka.EnableEurekaClient;*/

@SpringBootApplication
// 新版本不需要EnableEurekaClient注解啦！！！！
public class ServiceuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceuserApplication.class, args);
    }

}
