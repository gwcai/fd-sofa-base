package com.fudianbank.base.rpc.log;

import com.fdb.topplan.common.head.FDBRequestTools;
import com.fdb.topplan.common.head.FDBResponseTools;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/12 11:24
 * @Description: 日志切面,
 */
@Slf4j
@Aspect
@Component
@Order(10)
public class LogAspect {

    @Pointcut("@within(LogAnnotation) || @annotation(LogAnnotation)")
    public void logPointCut(){
        //签名，可以理解成这个切入点的一个名称
    }

    /***
     * 接口调用入口日志记录
     * @param joinPoint
     */
    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint){
        //logMethodInfo(joinPoint);
        LogAnnotation annotation = getLogAnnotation(joinPoint);
        //顺序：className.method,args,SvcCd,SvcScn,CnsmrSysId,TxnDt,TxnTm,CnsmrSeqNo,EventNo,AplTimestamp
        //log.info("{},SvcCd={},SvcScn={},CnsmrSysId={},TxnDt={},TxnTm={},CnsmrSeqNo={},EventNo={},AplTimestamp={}",
        log.info("[{}]:{},{},{},{},{},{},{},{},{},{},{}",
                annotation.digest(),
                joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(),
                joinPoint.getArgs(),
                FDBRequestTools.SysHead.getSvcCd(),
                FDBRequestTools.SysHead.getSvcScn(),
                FDBRequestTools.SysHead.getCnsmrSysId(),
                FDBRequestTools.SysHead.getTxnDt(),
                FDBRequestTools.SysHead.getTxnTm(),
                FDBRequestTools.SysHead.getCnsmrSeqNo(),
                FDBRequestTools.SysHead.getEventNo(),
                FDBRequestTools.AppHead.getAplTimestamp());
    }

    /***
     * 接口正常返回日志记录
     * @param joinPoint 切入点
     * @param result 返回数据
     */
    @AfterReturning(pointcut = "logPointCut()",returning="result")
    public void printLog(JoinPoint joinPoint,Object result){
        LogAnnotation annotation = getLogAnnotation(joinPoint);
        //log.info("Response Head: CnsmrSeqNo={},SvcSplrSeqNo={},EventNo={},TxnSt={},TxnDealTp={},RetCd={},RetMsg={},RetErrDataInf={}",
        log.info("[{}]:{},{},{},{},{},{},{},{},{},{},{},",
                annotation.digest(),
                joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(),
                joinPoint.getArgs(),
                FDBResponseTools.SysHead.getCnsmrSeqNo(),
                FDBResponseTools.SysHead.getSvcSplrSeqNo(),
                FDBResponseTools.SysHead.getEventNo(),
                FDBResponseTools.SysHead.getTxnSt(),
                FDBResponseTools.SysHead.getTxnDealTp(),
                FDBResponseTools.SysHead.getRetCd(),
                FDBResponseTools.SysHead.getRetMsg(),
                FDBResponseTools.SysHead.getRetErrDataInf(),
                result
        );
    }

    /***
     * 接口异常日志记录
     * @param joinPoint 切入点
     * @param e 异常信息
     */
    @AfterThrowing(pointcut = "logPointCut()",throwing = "e")
    public void exceptionLog(JoinPoint joinPoint,Exception e){
        LogAnnotation annotation = getLogAnnotation(joinPoint);
        //log.error("Exception：CnsmrSeqNo={},EventNo={},exMsg={}",
        log.error("[{}-ERROR]:{},{},{},{},{},{}",
                annotation.digest(),
                joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(),
                joinPoint.getArgs(),
                FDBRequestTools.SysHead.getCnsmrSeqNo(),
                FDBRequestTools.SysHead.getEventNo(),
                e.getMessage()
                );
        //log.error("[{}-ERROR]:{}",annotation.digest(),e.getStackTrace());
    }

    /***
     * 记录调用方法相关信息
     * @param joinPoint 切入点
     */
    private LogAnnotation getLogAnnotation(JoinPoint joinPoint){
        //获取url,请求方法，ip地址，类名以及方法名，参数
        LogAnnotation annotation = joinPoint.getTarget().getClass().getAnnotation(LogAnnotation.class);
        if(null == annotation){
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            Method method = methodSignature.getMethod();
            annotation = method.getAnnotation(LogAnnotation.class);
        }
        return annotation;
    }
}