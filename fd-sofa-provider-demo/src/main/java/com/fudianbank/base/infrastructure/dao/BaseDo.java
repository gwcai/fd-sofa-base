package com.fudianbank.base.infrastructure.dao;


/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 16:08
 * @Description:
 */
public class BaseDo<ID> {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
