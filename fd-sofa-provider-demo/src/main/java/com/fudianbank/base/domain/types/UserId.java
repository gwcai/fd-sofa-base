package com.fudianbank.base.domain.types;

import com.fudianbank.base.domain.entity.Identifier;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 15:43
 * @Description:
 */
public class UserId implements Identifier {
    private String id;

    public UserId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
