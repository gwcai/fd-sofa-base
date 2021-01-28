package com.fudianbank.base.esb.head;

import java.util.List;

/**
 * @Author gaoweicai
 * @Date 2021-1-26 09:24:39
 * @Description ESB 请求报文公共报文头
 */
public class ReqLocalHead {
    /***
     * 柜员号
     */
    private String txnTlrId;
    /***
     * 机构代码
     */
    private String orgId;
    /***
     * 柜员密码
     */
    private String tlrPwsd;
    /***
     * 授权标志
     */
    private String ahrFlag;

    public List<AhrTlrInfo> getAhrTlrInfo() {
        return ahrTlrInfo;
    }

    public void setAhrTlrInfo(List<AhrTlrInfo> ahrTlrInfo) {
        this.ahrTlrInfo = ahrTlrInfo;
    }

    /***
     * 授权柜员信息数组
     */
    private List<AhrTlrInfo> ahrTlrInfo;
    /***
     * 提供方交易码
     */
    private String prvdTxCd;
    /***
     * 法人代码
     */
    private String lglPrsnCd;
    /***
     * 密钥名称
     */
    private String scrtKeyNm;
    /***
     * 交易发生地
     */
    private String tranHpnAdr;
    /***
     * 渠道IP地址
     */
    private String chnlIPAdr;
    /***
     * 渠道MAC地址
     */
    private String chnlMACAdr;
    /***
     * 保留字段
     */
    private String reserves1;
    /***
     * 保留字段
     */
    private String reserves2;
    /***
     * 保留字段
     */
    private String reserves3;
    /***
     * 保留字段
     */
    private String reserves4;
    /***
     * 保留字段
     */
    private String reserves5;
    /***
     * 保留字段
     */
    private String reserves6;
    /***
     * 保留字段
     */
    private String reserves7;
    /***
     * 保留字段
     */
    private String reserves8;
    /***
     * 保留字段
     */
    private String reserves9;
    /***
     * 保留字段
     */
    private String reserves10;
    /***
     * 保留字段
     */
    private String reserves11;
    /***
     * 保留字段
     */
    private String reserves12;
    /***
     * 保留字段
     */
    private String reserves13;
    /***
     * 保留字段
     */
    private String reserves14;
    /***
     * 保留字段
     */
    private String reserves15;
    /***
     * 保留字段
     */
    private String reserves16;

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

    public String getPrvdTxCd() {
        return prvdTxCd;
    }

    public void setPrvdTxCd(String prvdTxCd) {
        this.prvdTxCd = prvdTxCd;
    }

    public String getLglPrsnCd() {
        return lglPrsnCd;
    }

    public void setLglPrsnCd(String lglPrsnCd) {
        this.lglPrsnCd = lglPrsnCd;
    }

    public String getScrtKeyNm() {
        return scrtKeyNm;
    }

    public void setScrtKeyNm(String scrtKeyNm) {
        this.scrtKeyNm = scrtKeyNm;
    }

    public String getTranHpnAdr() {
        return tranHpnAdr;
    }

    public void setTranHpnAdr(String tranHpnAdr) {
        this.tranHpnAdr = tranHpnAdr;
    }

    public String getChnlIPAdr() {
        return chnlIPAdr;
    }

    public void setChnlIPAdr(String chnlIPAdr) {
        this.chnlIPAdr = chnlIPAdr;
    }

    public String getChnlMACAdr() {
        return chnlMACAdr;
    }

    public void setChnlMACAdr(String chnlMACAdr) {
        this.chnlMACAdr = chnlMACAdr;
    }

    public String getReserves1() {
        return reserves1;
    }

    public void setReserves1(String reserves1) {
        this.reserves1 = reserves1;
    }

    public String getReserves2() {
        return reserves2;
    }

    public void setReserves2(String reserves2) {
        this.reserves2 = reserves2;
    }

    public String getReserves3() {
        return reserves3;
    }

    public void setReserves3(String reserves3) {
        this.reserves3 = reserves3;
    }

    public String getReserves4() {
        return reserves4;
    }

    public void setReserves4(String reserves4) {
        this.reserves4 = reserves4;
    }

    public String getReserves5() {
        return reserves5;
    }

    public void setReserves5(String reserves5) {
        this.reserves5 = reserves5;
    }

    public String getReserves6() {
        return reserves6;
    }

    public void setReserves6(String reserves6) {
        this.reserves6 = reserves6;
    }

    public String getReserves7() {
        return reserves7;
    }

    public void setReserves7(String reserves7) {
        this.reserves7 = reserves7;
    }

    public String getReserves8() {
        return reserves8;
    }

    public void setReserves8(String reserves8) {
        this.reserves8 = reserves8;
    }

    public String getReserves9() {
        return reserves9;
    }

    public void setReserves9(String reserves9) {
        this.reserves9 = reserves9;
    }

    public String getReserves10() {
        return reserves10;
    }

    public void setReserves10(String reserves10) {
        this.reserves10 = reserves10;
    }

    public String getReserves11() {
        return reserves11;
    }

    public void setReserves11(String reserves11) {
        this.reserves11 = reserves11;
    }

    public String getReserves12() {
        return reserves12;
    }

    public void setReserves12(String reserves12) {
        this.reserves12 = reserves12;
    }

    public String getReserves13() {
        return reserves13;
    }

    public void setReserves13(String reserves13) {
        this.reserves13 = reserves13;
    }

    public String getReserves14() {
        return reserves14;
    }

    public void setReserves14(String reserves14) {
        this.reserves14 = reserves14;
    }

    public String getReserves15() {
        return reserves15;
    }

    public void setReserves15(String reserves15) {
        this.reserves15 = reserves15;
    }

    public String getReserves16() {
        return reserves16;
    }

    public void setReserves16(String reserves16) {
        this.reserves16 = reserves16;
    }
}
