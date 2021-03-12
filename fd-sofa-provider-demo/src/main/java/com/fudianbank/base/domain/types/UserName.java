package com.fudianbank.base.domain.types;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 17:11
 * @Description:
 */
public class UserName {
    private String name;

    public UserName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
