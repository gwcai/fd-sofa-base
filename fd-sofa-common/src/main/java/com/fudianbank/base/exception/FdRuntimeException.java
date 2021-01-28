package com.fudianbank.base.exception;

import java.util.HashMap;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/26 10:46
 * @Description: 富滇自定义异常
 */
public class FdRuntimeException extends RuntimeException {
    /***
     * 异常错误码
     */
    private String code;
    /***
     * 异常业务数据
     */
    private HashMap bizData;

    /***
     * 构造函数
     * @param code
     * @param message
     */
    public FdRuntimeException(String code,String message){
        super(message);
        this.code = code;
    }

    /***
     * @param code
     * @param message
     * @param cause
     */
    public FdRuntimeException(String code,String message,Throwable cause){
        super(message,cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HashMap getBizData() {
        return bizData;
    }

    public void setBizData(HashMap bizData) {
        this.bizData = bizData;
    }
}
