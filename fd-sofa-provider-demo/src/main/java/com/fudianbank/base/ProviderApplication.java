package com.fudianbank.base;


import com.fdb.topplan.base.FDBBaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 10:50
 * @Description:
 */
@ImportResource({"classpath*:META-INF/com-fudian-base-provider/*.xml"})
@SpringBootApplication
public class ProviderApplication  {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}