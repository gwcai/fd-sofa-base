package com.fudianbank.base;


import com.fudianbank.base.rpc.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 10:50
 * @Description:
 */
@ImportResource({"classpath*:META-INF/com-fudian-base-provider/*.xml"})
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan("com.fudianbank.base.*")
@SpringBootApplication
public class ProviderApplication  extends BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}