package com.fudianbank.base.domain;

import com.fudianbank.base.domain.entity.Aggregate;
import com.fudianbank.base.domain.entity.Identifier;
import com.fudianbank.base.domain.types.UserId;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/25 19:57
 * @Description:
 */
public class BaseEntity<ID extends Identifier> implements Aggregate<ID> {
    ID id;
    @Override
    public ID getId() {
        return id;
    }

    public void setId(ID id){
        this.id = id;
    }
}
