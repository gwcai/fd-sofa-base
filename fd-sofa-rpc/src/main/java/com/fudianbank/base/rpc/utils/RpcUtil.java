package com.fudianbank.base.rpc.utils;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.rpc.context.RpcInvokeContext;
import com.fudianbank.base.constants.ErrorCode;
import com.fudianbank.base.esb.head.ReqAppHead;
import com.fudianbank.base.esb.head.ReqLocalHead;
import com.fudianbank.base.esb.head.ReqSysHead;
import com.fudianbank.base.esb.message.ReqMessageHead;
import com.fudianbank.base.esb.message.ResMessageHead;
import com.fudianbank.base.exception.FdRuntimeException;
import org.apache.commons.lang.StringEscapeUtils;

import java.nio.charset.Charset;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 11:11
 * @Description:
 */
public class RpcUtil {
    /***
     * 从上线文环境中取得请求报文头
     * @return ReqMessageHead
     */
    public static ReqMessageHead getReqMessageHead(){
        RpcInvokeContext context = RpcInvokeContext.getContext();
        String strSysHead = StringEscapeUtils.unescapeJava(context.getRequestBaggage("SysHead"));
        String strLocalHead = StringEscapeUtils.unescapeJava(context.getRequestBaggage("LocalHead"));
        String strAppHead = StringEscapeUtils.unescapeJava(context.getRequestBaggage("AppHead"));

        ReqMessageHead head = new ReqMessageHead();
        head.setSysHead(JSON.parseObject(strSysHead,ReqSysHead.class));
        head.setLocalHead(JSON.parseObject(strLocalHead,ReqLocalHead.class));
        head.setAppHead(JSON.parseObject(strAppHead,ReqAppHead.class));
        return head;
    }

    /***
     * 将请求报文头放到上下文环境中
     * @param messageHead
     */
    public static void setReqMessageHead(ReqMessageHead messageHead){
        RpcInvokeContext context = RpcInvokeContext.getContext();
        context.putAllRequestBaggage(messageHead.toMap());
//        context.putRequestBaggage("SysHead",JSON.toJSONString(messageHead.getSysHead()));
//        context.putRequestBaggage("AppHead",JSON.toJSONString(messageHead.getAppHead()));
//        context.putRequestBaggage("LocalHead",JSON.toJSONString(messageHead.getLocalHead()));
    }

    public static ResMessageHead getResMessageHead(){
        RpcInvokeContext context = RpcInvokeContext.getContext();
        String strSysHead = StringEscapeUtils.unescapeJava(context.getResponseBaggage("SysHead"));
        return JSON.parseObject(strSysHead,ResMessageHead.class);
    }

    /***
     * 交易处理成功报文头处理
     */
    public static void setSuccessResMessageHead(){
        ResMessageHead resHead = setResHeadCommon();

        //系统调用状态:0－系统处理成功  1－系统处理失败
        resHead.setTxnSt("1");
        //交易处理状态：0－系统处理成功 1－系统处理失败
        resHead.setTxnDealTp("1");
        resHead.setRetCd(ErrorCode.SUCCESS);
        resHead.setRetMsg("");
        setResMessageHead(resHead);
    }

    /***
     * rpc调用失败处理
     * @param ex
     */
    public static void setFailResMessageHead(FdRuntimeException ex){
        ResMessageHead resHead = setResHeadCommon();

        //系统调用状态:0－系统处理成功  1－系统处理失败
        resHead.setTxnSt("1");
        //交易处理状态：0－系统处理成功 1－系统处理失败
        resHead.setTxnDealTp("1");
        resHead.setRetCd(ex.getCode());
        resHead.setRetMsg(ex.getMessage());
        setResMessageHead(resHead);
    }

    /***
     * 将返回报文头放入返回上下文环境中
     * @param sysHead
     */
    private static void setResMessageHead(ResMessageHead sysHead){
        RpcInvokeContext context = RpcInvokeContext.getContext();
        String strData = JSON.toJSONString(sysHead);
        context.putResponseBaggage("SysHead", StringEscapeUtils.escapeJava(strData));
    }

    private static ResMessageHead setResHeadCommon(){
        ReqMessageHead reqMessageHead = getReqMessageHead();
        ResMessageHead resHead = new ResMessageHead();
        if(null != reqMessageHead && null != reqMessageHead.getSysHead()) {
            resHead.setTest(reqMessageHead.getSysHead().isTest());
            resHead.setTraceId(reqMessageHead.getSysHead().getTraceId());
            resHead.setSpanId(reqMessageHead.getSysHead().getSpanId());
            //服务调用方系统流水号
            resHead.setCnsmrSeqNo(reqMessageHead.getSysHead().getCnsmrSeqNo());
            //服务提供方系统流水号
            resHead.setSvcSplrSeqNo("SvcSplrSeqNo");
            resHead.setEventNo(reqMessageHead.getSysHead().getEventNo());
            //系统调用状态:0－系统处理成功  1－系统处理失败
            resHead.setTxnSt("1");
            //交易处理状态：0－系统处理成功 1－系统处理失败
            resHead.setTxnDealTp("1");

            /***
             * 柜员号获取
             * LocalHead
             */
            resHead.setTxnTlrId(reqMessageHead.getLocalHead().getTxnTlrId());
            resHead.setTlrPwsd(reqMessageHead.getLocalHead().getTlrPwsd());
            resHead.setOrgId(reqMessageHead.getLocalHead().getOrgId());
            resHead.setAhrFlag(reqMessageHead.getLocalHead().getAhrFlag());
            resHead.setAhrTlrInfo(reqMessageHead.getLocalHead().getAhrTlrInfo());
        }
        return resHead;
    }
}
