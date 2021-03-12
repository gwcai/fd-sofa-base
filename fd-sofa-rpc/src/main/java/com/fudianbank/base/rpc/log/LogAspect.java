package com.fudianbank.base.rpc.log;

import com.fdb.topplan.common.head.FDBRequestTools;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/12 11:24
 * @Description: 日志切面
 */
@Aspect
@Component
//@Order(1)
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(com.fudianbank.base.rpc.log.SofaLogBack)")
    public void logPointCut(){
        //签名，可以理解成这个切入点的一个名称
    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint){
        String myparam1="myparam1"+System.currentTimeMillis();
        //获取url,请求方法，ip地址，类名以及方法名，参数
        FDBRequestTools.SysHead.setCnsmrSeqNo("8888888888888");
        String s = FDBRequestTools.SysHead.getCnsmrSeqNo();
        Object[] o = joinPoint.getArgs();
        logger.info("CnsmrSeqNo={},args={}", s,joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(),joinPoint.getArgs());

    }
    @AfterReturning(pointcut = "logPointCut()",returning="result")
    public void printLog(JoinPoint joinPoint,Object result){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        SofaLogBack log = method.getAnnotation(SofaLogBack.class);
        String value = null;
        if (log!=null){
            value = log.value();
        }
        logger.info(new Date()+"-----"+value);
    }

}