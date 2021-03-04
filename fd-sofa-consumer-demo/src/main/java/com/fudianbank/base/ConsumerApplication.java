package com.fudianbank.base;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.rpc.context.RpcInvokeContext;
import com.fdb.topplan.base.head.FDBRequestTools;
import com.fdb.topplan.base.head.FDBResponseTools;
import com.fudianbank.base.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 20:39
 * @Description:
 */
@ImportResource({"classpath*:META-INF/com-fudian-base-consumer/*.xml"})
@SpringBootApplication
public class ConsumerApplication {

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
        System.out.println(strSysHead);
//        ResMessageHead messageHead = RpcUtil.getResMessageHead();
//        System.out.println(JSON.toJSON(messageHead).toString());
    }

    private static void createMessageHead(){
        FDBRequestTools.SysHead.setEventNo("1234567890");
    }
}
