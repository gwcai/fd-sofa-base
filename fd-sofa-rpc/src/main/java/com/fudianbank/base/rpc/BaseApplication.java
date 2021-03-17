package com.fudianbank.base.rpc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 10:42
 * @Description:
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.fudianbank.base.*")
public class BaseApplication {

}
