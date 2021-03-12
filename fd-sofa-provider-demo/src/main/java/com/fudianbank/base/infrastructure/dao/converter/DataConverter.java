package com.fudianbank.base.infrastructure.dao.converter;

import com.fudianbank.base.domain.entity.Entity;
import com.fudianbank.base.infrastructure.dao.BaseDo;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 16:43
 * @Description:
 */
public interface DataConverter {
    BaseDo toDao(Entity entity);

    Entity toEntity(BaseDo dao);
}
