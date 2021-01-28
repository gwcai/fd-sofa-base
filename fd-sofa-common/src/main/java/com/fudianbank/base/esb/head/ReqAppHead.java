package com.fudianbank.base.esb.head;
/***
 * @Author gaoweicai
 * @Date 2021-1-26 09:24:39
 * @Description ESB 请求报文公共报文头
 */
public class ReqAppHead {
    /***
     * 是否支持24小时标志
     * 在做支持24小时的业务时允许终端上送日期与主机系统日期相差1天
     * 0- 是
     * 1- 否
     */
    private String rfnc24HourFlagp;
    /***
     * 应用时间戳:YYYY-MM-dd HH:mm:ss.SSSSSS
     */
    private String aplTimestamp;
    /***
     * 服务发起方产品ID
     */
    private String origCnsmrPrdctID;
    /***
     * 服务调用方产品ID
     */
    private String cnsmrPrdctID;

    public String getRfnc24HourFlagp() {
        return rfnc24HourFlagp;
    }

    public void setRfnc24HourFlagp(String rfnc24HourFlagp) {
        this.rfnc24HourFlagp = rfnc24HourFlagp;
    }

    public String getAplTimestamp() {
        return aplTimestamp;
    }

    public void setAplTimestamp(String aplTimestamp) {
        this.aplTimestamp = aplTimestamp;
    }

    public String getOrigCnsmrPrdctID() {
        return origCnsmrPrdctID;
    }

    public void setOrigCnsmrPrdctID(String origCnsmrPrdctID) {
        this.origCnsmrPrdctID = origCnsmrPrdctID;
    }

    public String getCnsmrPrdctID() {
        return cnsmrPrdctID;
    }

    public void setCnsmrPrdctID(String cnsmrPrdctID) {
        this.cnsmrPrdctID = cnsmrPrdctID;
    }
}
