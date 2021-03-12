package com.fudianbank.base.domain.entity;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 15:52
 * @Description:
 */
public interface Identifiable<ID extends Identifier> {
    ID getId();
}
