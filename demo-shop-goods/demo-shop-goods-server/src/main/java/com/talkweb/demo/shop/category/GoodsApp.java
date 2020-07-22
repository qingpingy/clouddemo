package com.talkweb.demo.shop.category;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 服务启动类
 * @Author: gavin
 * @Date: 2020/2/26 09:49
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GoodsApp {
    public static void main(String[] args) {
        final SpringApplication sa = new SpringApplication(GoodsApp.class);
        sa.addListeners(new ApplicationPidFileWriter("goods-server.pid"));
        sa.run(args);
    }
}
