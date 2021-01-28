package com.fudianbank.base;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.rpc.context.RpcInvokeContext;
import com.fudianbank.base.HelloService;
import com.fudianbank.base.esb.head.ReqAppHead;
import com.fudianbank.base.esb.head.ReqLocalHead;
import com.fudianbank.base.esb.head.ReqSysHead;
import com.fudianbank.base.esb.message.ReqMessageHead;
import com.fudianbank.base.esb.message.ResMessageHead;
import com.fudianbank.base.rpc.BaseApplication;
import com.fudianbank.base.rpc.utils.RpcUtil;
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
public class ConsumerApplication extends BaseApplication {

//    @SofaReference(interfaceType = HelloService.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
//    private static HelloService helloService;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConsumerApplication.class);
        ApplicationContext applicationContext = application.run(args);

        final HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        //设置报文头
        RpcUtil.setReqMessageHead(createMessageHead());
        String data = helloService.hello("niko");
        System.out.println(data);

        helloService.exception();
        String strSysHead = RpcInvokeContext.getContext().getResponseBaggage("SysHead");
        System.out.println(strSysHead);
//        ResMessageHead messageHead = RpcUtil.getResMessageHead();
//        System.out.println(JSON.toJSON(messageHead).toString());
    }

    private static ReqMessageHead createMessageHead(){
        ReqMessageHead messageHead = new ReqMessageHead();
        ReqSysHead sysHead = new ReqSysHead();
        sysHead.setEventNo("1234567890");
        ReqAppHead appHead = new ReqAppHead();
        ReqLocalHead localHead = new ReqLocalHead();
        messageHead.setSysHead(sysHead);
        messageHead.setAppHead(appHead);
        messageHead.setLocalHead(localHead);
        return messageHead;
    }
}
