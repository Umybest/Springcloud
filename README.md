主要是基于eureka和Nacos实现服务的注册和发现，由于用到的是比较新的版本，都有遇到过版本冲突的问题。经过不端尝试，终于成功了。供各位好朋友参考！！！

```
eurekaserver是eureka server端
serviceuser是微服务==eureka client
springboot 3.2.2version + 4.1.0 然后client启动一致报错 参见eureka issue： https://github.com/spring-cloud/spring-cloud-netflix/issues/4236
然后按照OlgaMaciaszek reply的sample，退回3.2.1 + 4.1.0 最后成功。
```

```
nacosService是基于Alibaba Nacos的服务注册，nacos客户端自行安装。
不要相信Idea的版本提醒，要学会查看版本依赖！！！nacos + springboot + springCloud的版本都要看！！！ naclos: 2022.0.0.0-RC2 + springboot:3.0.2 + Spring Cloud:2022.0.0
https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E
```
