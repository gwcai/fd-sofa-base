package com.fudianbank.base.infrastructure.dao;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 17:08
 * @Description:
 */
public class UserDo extends BaseDo<String> {
    private String name;
    private String idNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
