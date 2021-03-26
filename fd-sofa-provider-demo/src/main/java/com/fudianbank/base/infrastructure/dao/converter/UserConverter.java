package com.fudianbank.base.infrastructure.dao.converter;

import com.fudianbank.base.domain.UserEntity;
import com.fudianbank.base.infrastructure.dao.UserDo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import javax.xml.crypto.Data;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/10 17:23
 * @Description:
 */
@Mapper(mappingInheritanceStrategy= MappingInheritanceStrategy.EXPLICIT)
public interface UserConverter extends DataConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);
    @Mappings({
            @Mapping(source = "id.id",target = "id"),
            @Mapping(source = "name.name",target = "name"),
            @Mapping(source = "idNo.idNo",target = "idNo")
    })
    UserDo toDao(UserEntity entity);

    @Mappings({
            @Mapping(source = "id",target = "id.id"),
            @Mapping(source = "name",target = "name.name"),
            @Mapping(source = "idNo",target = "idNo.idNo")
    })
    UserEntity toEntity(UserDo dao);
}
