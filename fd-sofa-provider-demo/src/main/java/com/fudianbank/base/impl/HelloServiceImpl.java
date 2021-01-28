package com.fudianbank.base.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.fudianbank.base.esb.message.ReqMessageHead;
import com.fudianbank.base.exception.FdRuntimeException;
import com.fudianbank.base.facade.HelloService;
import com.fudianbank.base.rpc.utils.RpcUtil;
import org.springframework.stereotype.Service;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 20:20
 * @Description:
 */
//@Service
//@SofaService(interfaceType = HelloService.class, uniqueId = "${service.unique.id}", bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        ReqMessageHead messageHead = RpcUtil.getReqMessageHead();
        String eventNo = messageHead.getSysHead().getEventNo();
        //System.out.println(messageHead.toJSON().toJSONString());

        return "Hello," + name;
    }

    @Override
    public void exception() {
        throw new FdRuntimeException("0001","测试");
    }
}
