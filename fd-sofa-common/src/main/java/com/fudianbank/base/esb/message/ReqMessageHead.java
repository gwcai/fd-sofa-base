package com.fudianbank.base.esb.message;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fudianbank.base.esb.head.ReqAppHead;
import com.fudianbank.base.esb.head.ReqLocalHead;
import com.fudianbank.base.esb.head.ReqSysHead;

import java.util.HashMap;
import java.util.Map;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 10:33
 * @Description:
 */
public class ReqMessageHead {
    private ReqSysHead sysHead;
    private ReqAppHead appHead;
    private ReqLocalHead localHead;

    /***
     * 将请求报文头转化为Map
     * @return map
     */
    public HashMap toMap(){
        HashMap map = new HashMap();
        map.put("SysHead", JSON.toJSONString(sysHead));
        map.put("AppHead",JSON.toJSONString(appHead));
        map.put("LocalHead",JSON.toJSONString(localHead));
        return map;
    }

    /***
     * 转化为JSON对象
     * @return JSONObject
     */
    public JSONObject toJSON(){
        JSONObject obj = new JSONObject();
        obj.putAll((JSONObject)JSON.toJSON(sysHead));
        obj.putAll((JSONObject)JSON.toJSON(appHead));
        obj.putAll((JSONObject)JSON.toJSON(localHead));
        return obj;
    }

    public ReqSysHead getSysHead() {
        return sysHead;
    }

    public void setSysHead(ReqSysHead sysHead) {
        this.sysHead = sysHead;
    }

    public ReqAppHead getAppHead() {
        return appHead;
    }

    public void setAppHead(ReqAppHead appHead) {
        this.appHead = appHead;
    }

    public ReqLocalHead getLocalHead() {
        return localHead;
    }

    public void setLocalHead(ReqLocalHead localHead) {
        this.localHead = localHead;
    }
}
