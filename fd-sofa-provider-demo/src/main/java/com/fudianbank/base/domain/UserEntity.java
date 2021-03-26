package com.fudianbank.base.domain;

import com.fudianbank.base.domain.entity.Aggregate;
import com.fudianbank.base.domain.types.IdNo;
import com.fudianbank.base.domain.types.UserId;
import com.fudianbank.base.domain.types.UserName;

import javax.jws.soap.SOAPBinding;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 17:09
 * @Description:
 */
public class UserEntity extends BaseEntity<UserId> {
    private UserName name;
    private IdNo idNo;

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
}
