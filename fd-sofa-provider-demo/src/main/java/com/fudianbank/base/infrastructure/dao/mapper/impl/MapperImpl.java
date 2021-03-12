package com.fudianbank.base.infrastructure.dao.mapper.impl;

import com.fudianbank.base.infrastructure.dao.BaseDo;
import com.fudianbank.base.infrastructure.dao.UserDo;
import com.fudianbank.base.infrastructure.dao.mapper.IMapper;
import org.springframework.stereotype.Repository;


/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 16:16
 * @Description:
 */
@Repository
public class MapperImpl<ID,T extends BaseDo> implements IMapper<ID,T> {

    @Override
    public int insert(T data) {
        return 0;
    }

    @Override
    public int update(T data) {
        return 0;
    }

    @Override
    public BaseDo selectById(ID id) {
        UserDo userDo = new UserDo();
        userDo.setId("1");
        userDo.setName("测试");
        userDo.setIdNo("123456789010111213");
        return userDo;
    }

    @Override
    public void delete(T data) {

    }

    @Override
    public void deleteById(ID id) {

    }
}
