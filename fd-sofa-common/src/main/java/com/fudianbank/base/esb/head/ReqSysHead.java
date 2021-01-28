package com.fudianbank.base.esb.head;

import java.util.HashMap;

/***
 * @Author gaoweicai
 * @Date 2021-1-26 09:24:39
 * @Description ESB 请求报文公共报文头
 */
public class ReqSysHead {
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
     * 服务唯一标识，由ESB提供服务码10位
     */
    private String svcCd;
    /***
     * 服务场景
     * 描述每个服务的应用场景，由ESB提供,具体在每个服务中说明。如果该服务只有一种使用,场景默认值必须为：01
     */
    private String svcScn;
    /***
     * 服务调用方系统编号
     * 服务请求应用系统编号；内容见：系统调查一览表。例如个人电子银行调用，电子银行系统为100200，个人电子银行为其子应用，系统编号为100201，此处为100201
     */
    private String cnsmrSysId;
    /***
     * 接口版本号
     */
    private String vrsn;
    /***
     * 交易日期: 格式为YYYYMMDD
     */
    private String txnDt;
    /***
     * 交易时间,格式为HH:MM:SS
     */
    private String txnTm;
    /***
     * 源发起方应用系统编号
     */
    private String origIttAplNo;
    /***
     * 服务调用方系统流水号
     */
    private String cnsmrSeqNo;
    /***
     * 源发起方渠道类型编码
     */
    private String txnChnlTp;
    /***
     * 服务调用方渠道类型编码
     */
    private String cnsmrChnlTpCd;
    /***
     * 服务请求系统的终端标识号
     */
    private String txnTmlId;
    /***
     * 唯一事件编号
     */
    private String eventNo;
    /***
     * 关联事件编号
     */
    private String rltEventNo;
    /***
     * 原事件编号
     */
    private String origEventNo;
    /***
     * 服务原发起方系统编号
     */
    private String origCnsmrId;
    /***
     * 服务原发起方终端号
     */
    private String origTmlId;
    /***
     * 文件标志
     * 取值范围：
     * 0 无文件；
     * 1 请求报文有文件传送；
     * 2应答报文有文件传送；
     * 3应答报文有文件流数组；
     * 4应答报文中交易记录数组；
     */
    private String fileFlag;
    /***
     * 消息认证码
     */
    private String mAC;

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

    public String getSvcCd() {
        return svcCd;
    }

    public void setSvcCd(String svcCd) {
        this.svcCd = svcCd;
    }

    public String getSvcScn() {
        return svcScn;
    }

    public void setSvcScn(String svcScn) {
        this.svcScn = svcScn;
    }

    public String getCnsmrSysId() {
        return cnsmrSysId;
    }

    public void setCnsmrSysId(String cnsmrSysId) {
        this.cnsmrSysId = cnsmrSysId;
    }

    public String getVrsn() {
        return vrsn;
    }

    public void setVrsn(String vrsn) {
        this.vrsn = vrsn;
    }

    public String getTxnDt() {
        return txnDt;
    }

    public void setTxnDt(String txnDt) {
        this.txnDt = txnDt;
    }

    public String getTxnTm() {
        return txnTm;
    }

    public void setTxnTm(String txnTm) {
        this.txnTm = txnTm;
    }

    public String getOrigIttAplNo() {
        return origIttAplNo;
    }

    public void setOrigIttAplNo(String origIttAplNo) {
        this.origIttAplNo = origIttAplNo;
    }

    public String getCnsmrSeqNo() {
        return cnsmrSeqNo;
    }

    public void setCnsmrSeqNo(String cnsmrSeqNo) {
        this.cnsmrSeqNo = cnsmrSeqNo;
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

    public String getTxnChnlTp() {
        return txnChnlTp;
    }

    public void setTxnChnlTp(String txnChnlTp) {
        this.txnChnlTp = txnChnlTp;
    }

    public String getCnsmrChnlTpCd() {
        return cnsmrChnlTpCd;
    }

    public void setCnsmrChnlTpCd(String cnsmrChnlTpCd) {
        this.cnsmrChnlTpCd = cnsmrChnlTpCd;
    }

    public String getTxnTmlId() {
        return txnTmlId;
    }

    public void setTxnTmlId(String txnTmlId) {
        this.txnTmlId = txnTmlId;
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public String getRltEventNo() {
        return rltEventNo;
    }

    public void setRltEventNo(String rltEventNo) {
        this.rltEventNo = rltEventNo;
    }

    public String getOrigEventNo() {
        return origEventNo;
    }

    public void setOrigEventNo(String origEventNo) {
        this.origEventNo = origEventNo;
    }

    public String getOrigCnsmrId() {
        return origCnsmrId;
    }

    public void setOrigCnsmrId(String origCnsmrId) {
        this.origCnsmrId = origCnsmrId;
    }

    public String getOrigTmlId() {
        return origTmlId;
    }

    public void setOrigTmlId(String origTmlId) {
        this.origTmlId = origTmlId;
    }

    public String getFileFlag() {
        return fileFlag;
    }

    public void setFileFlag(String fileFlag) {
        this.fileFlag = fileFlag;
    }

    public String getmAC() {
        return mAC;
    }

    public void setmAC(String mAC) {
        this.mAC = mAC;
    }
}
