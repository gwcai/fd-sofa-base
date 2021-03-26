package com.fudianbank.base.infrastructure.dao.converter;

import com.fudianbank.base.domain.BaseEntity;
import com.fudianbank.base.domain.UserEntity;
import com.fudianbank.base.domain.entity.Entity;
import com.fudianbank.base.infrastructure.dao.BaseDo;
import com.fudianbank.base.infrastructure.dao.UserDo;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 16:43
 * @Description:
 */
public interface DataConverter {
    @InheritConfiguration()
    BaseDo toDao(BaseEntity entity);
    @Mapping(target = "id",ignore = true)
    BaseEntity toEntity(BaseDo dao);
}
