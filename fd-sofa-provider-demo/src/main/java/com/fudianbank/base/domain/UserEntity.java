package com.fudianbank.base.domain;

import com.fudianbank.base.domain.entity.Aggregate;
import com.fudianbank.base.domain.types.IdNo;
import com.fudianbank.base.domain.types.UserId;
import com.fudianbank.base.domain.types.UserName;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 17:09
 * @Description:
 */
public class UserEntity implements Aggregate<UserId> {
    private UserId id;
    private UserName name;
    private IdNo idNo;

    public void setId(UserId id){
        this.id = id;
    }

    public UserName getName() {
        return name;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public IdNo getIdNo() {
        return idNo;
    }

    public void setIdNo(IdNo idNo) {
        this.idNo = idNo;
    }

    @Override
    public UserId getId() {
        return id;
    }
}
