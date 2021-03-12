package com.fudianbank.base.infrastructure.dao.converter;

import com.fudianbank.base.domain.entity.Entity;
import com.fudianbank.base.infrastructure.dao.BaseDo;
import org.mapstruct.Mapper;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/10 17:23
 * @Description:
 */
public class UserConverter implements DataConverter {
    @Override
    public BaseDo toDao(Entity entity) {
        return null;
    }

    @Override
    public Entity toEntity(BaseDo dao) {
        return null;
    }
}
