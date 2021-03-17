package com.fudianbank.base;

import com.fdb.topplan.common.head.FDBRequestTools;
import com.fdb.topplan.common.head.FDBResponseTools;
import com.fudianbank.base.rpc.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 20:39
 * @Description:
 */
@ImportResource({"classpath*:META-INF/com-fudian-base-consumer/*.xml"})
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan("com.fudianbank.base.*")
@SpringBootApplication
public class ConsumerApplication extends BaseApplication {

//    @SofaReference(interfaceType = HelloService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
//    private static HelloService helloService;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConsumerApplication.class);
        ApplicationContext applicationContext = application.run(args);

        final HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        //设置报文头
        createMessageHead();
        String data = helloService.hello("niko");
        System.out.println(data);

        helloService.exception();
        String strSysHead = FDBResponseTools.SysHead.getRetMsg();
        String eventNo = FDBResponseTools.SysHead.getEventNo();
        System.out.println(eventNo);
//        ResMessageHead messageHead = RpcUtil.getResMessageHead();
//        System.out.println(JSON.toJSON(messageHead).toString());
    }

    private static void createMessageHead(){
        FDBRequestTools.SysHead.setEventNo("1234567890");
    }
}
