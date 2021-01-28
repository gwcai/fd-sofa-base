package com.fudianbank.base.esb.head;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 9:54
 * @Description: 授权柜员信息数组
 */
public class AhrTlrInfo {
    /***
     * 授权柜员标识
     */
    private String ahrTlrId;
    /***
     * 授权机构代码
     */
    private String ahrOrgId;
    /***
     * 授权柜员密码
     */
    private String ahrTlrPswd;
    /***
     * 授权柜员级别
     */
    private String ahrTlrLvl;
    /***
     * 授权柜员类别
     */
    private String ahrTlrTp;
    /***
     * 授权柜员类别
     */
    private String ahrBckCd;

    public String getAhrTlrId() {
        return ahrTlrId;
    }

    public void setAhrTlrId(String ahrTlrId) {
        this.ahrTlrId = ahrTlrId;
    }

    public String getAhrOrgId() {
        return ahrOrgId;
    }

    public void setAhrOrgId(String ahrOrgId) {
        this.ahrOrgId = ahrOrgId;
    }

    public String getAhrTlrPswd() {
        return ahrTlrPswd;
    }

    public void setAhrTlrPswd(String ahrTlrPswd) {
        this.ahrTlrPswd = ahrTlrPswd;
    }

    public String getAhrTlrLvl() {
        return ahrTlrLvl;
    }

    public void setAhrTlrLvl(String ahrTlrLvl) {
        this.ahrTlrLvl = ahrTlrLvl;
    }

    public String getAhrTlrTp() {
        return ahrTlrTp;
    }

    public void setAhrTlrTp(String ahrTlrTp) {
        this.ahrTlrTp = ahrTlrTp;
    }

    public String getAhrBckCd() {
        return ahrBckCd;
    }

    public void setAhrBckCd(String ahrBckCd) {
        this.ahrBckCd = ahrBckCd;
    }
}
