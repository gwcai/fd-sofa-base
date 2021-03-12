package com.fudianbank.base.infrastructure.dao.mapper;

import com.fudianbank.base.infrastructure.dao.BaseDo;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 16:11
 * @Description:
 */
public interface IMapper<ID,T extends BaseDo> {
    int insert(T data);

    int update(T data);

    BaseDo selectById(ID id);

    void delete(T data);

    void deleteById(ID id);
}
