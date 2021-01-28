package com.fudianbank.base.esb.message;

import com.fudianbank.base.esb.head.AhrTlrInfo;

import java.util.List;

/***
 * @Author: gaoweicai
 * @Date:   2021/1/26 9:52
 * @Description: ESB返回报文头
 */
public class ResMessageHead {
    /***
     * 压测标志
     * 0、压测 1、生产
     */
    private boolean isTest;
    /***
     * 用于rpc链路追踪
     */
    private String traceId;
    /***
     * 当前rpc调用的spanid  rpcid
     */
    private String spanId;

    /***
     * 服务调用方系统流水号
     */
    private String cnsmrSeqNo;
    /***
     * 服务提供方流水号
     */
    private String svcSplrSeqNo;
    /***
     * 唯一事件编号
     * 服务原始请求系统的业务流水号,用来唯一标识一笔业务。用法详见《富滇银行企业服务总线接入规范》
     */
    private String eventNo;
    /***
     * 取值范围：
     * 0－系统处理成功
     * 1－系统处理失败
     * ESB系统处理标志，提供方赋值0
     */
    private String txnSt;
    /***
     * 取值范围：
     * 0－交易处理成功
     * 1－交易处理失败
     * 提供方业务处理标志，提供方根据实际处理结果赋值。
     * 调用方系统先根据“系统调用状态”确定ESB调用是否成功，再根据“交易处理结果”判断业务交易是否成功。
     */
    private String txnDealTp;
    /***
     * 成功---000000
     * 失败---后台系统对业务错误代码的定义
     */
    private String retCd;
    /***
     * 后台系统对业务错误的定义
     */
    private String retMsg;
    /***
     * 柜员号
     */
    private String txnTlrId;
    /***
     * 服务请求者的机构归属
     */
    private String orgId;
    /***
     * 服务请求者的密码
     */
    private String tlrPwsd;
    /***
     * 当交易发生授权时的取值范围如下：
     * 0-不需要授权
     * 1-本地授权
     * 2-远程授权
     * 授权时必输
     */
    private String ahrFlag;

    public List<AhrTlrInfo> getAhrTlrInfo() {
        return ahrTlrInfo;
    }

    public void setAhrTlrInfo(List<AhrTlrInfo> ahrTlrInfo) {
        this.ahrTlrInfo = ahrTlrInfo;
    }

    private List<AhrTlrInfo> ahrTlrInfo;

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getCnsmrSeqNo() {
        return cnsmrSeqNo;
    }

    public void setCnsmrSeqNo(String cnsmrSeqNo) {
        this.cnsmrSeqNo = cnsmrSeqNo;
    }

    public String getSvcSplrSeqNo() {
        return svcSplrSeqNo;
    }

    public void setSvcSplrSeqNo(String svcSplrSeqNo) {
        this.svcSplrSeqNo = svcSplrSeqNo;
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public String getTxnSt() {
        return txnSt;
    }

    public void setTxnSt(String txnSt) {
        this.txnSt = txnSt;
    }

    public String getTxnDealTp() {
        return txnDealTp;
    }

    public void setTxnDealTp(String txnDealTp) {
        this.txnDealTp = txnDealTp;
    }

    public String getRetCd() {
        return retCd;
    }

    public void setRetCd(String retCd) {
        this.retCd = retCd;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getTxnTlrId() {
        return txnTlrId;
    }

    public void setTxnTlrId(String txnTlrId) {
        this.txnTlrId = txnTlrId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getTlrPwsd() {
        return tlrPwsd;
    }

    public void setTlrPwsd(String tlrPwsd) {
        this.tlrPwsd = tlrPwsd;
    }

    public String getAhrFlag() {
        return ahrFlag;
    }

    public void setAhrFlag(String ahrFlag) {
        this.ahrFlag = ahrFlag;
    }
}
