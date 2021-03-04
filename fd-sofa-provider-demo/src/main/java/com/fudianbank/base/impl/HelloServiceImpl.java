package com.fudianbank.base.impl;

import com.fdb.topplan.base.exception.FDBRuntimeException;
import com.fdb.topplan.base.head.FDBRequestTools;
import com.fudianbank.base.facade.HelloService;

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
        String eventNo = FDBRequestTools.SysHead.getEventNo();
        System.out.println(eventNo);

        return "Hello," + name;
    }

    @Override
    public void exception() {
        throw new FDBRuntimeException("0001","测试");
    }
}
