package com.fudianbank.base.infrastructure;

import com.fdb.topplan.common.exception.FDBRuntimeException;
import com.fdb.topplan.common.head.FDBRequestTools;
import com.fdb.topplan.common.head.FDBResponseTools;
import com.fudianbank.base.facade.HelloService;
import com.fudianbank.base.rpc.log.LogAnnotation;
import com.fudianbank.base.rpc.log.LogDigest;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 20:20
 * @Description:
 */
//@Service
//@SofaService(interfaceType = HelloService.class, uniqueId = "${service.unique.id}", bindings = { @SofaServiceBinding(bindingType = "bolt") })
@LogAnnotation(digest = LogDigest.DIGEST_QUERY)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        String eventNo = FDBRequestTools.SysHead.getEventNo();
        System.out.println(eventNo);

        return "Hello," + name;
    }

    @Override
    public void exception() {
        String e = FDBRequestTools.SysHead.getEventNo();
        FDBResponseTools.SysHead.setEventNo(e);
        throw new FDBRuntimeException("0001","测试");
    }
}
