package com.fudianbank.base.infrastructure.dao.repository;

import com.fudianbank.base.domain.entity.Aggregate;
import com.fudianbank.base.domain.entity.Identifier;
import com.fudianbank.base.domain.repository.BaseRepository;
import com.fudianbank.base.infrastructure.dao.BaseDo;
import com.fudianbank.base.infrastructure.dao.UserDo;
import com.fudianbank.base.infrastructure.dao.converter.DataConverter;
import com.fudianbank.base.infrastructure.dao.mapper.IMapper;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/***
 * @Author: gaoweicai
 * @Date: 2021/3/5 15:45
 * @Description:E
 */
public class BaseRepositoryImpl<E extends Aggregate<ID>,T extends BaseDo, ID extends Identifier> implements BaseRepository<E, ID> {
    private final IMapper mapper;
    DataConverter dataConverter;

    public BaseRepositoryImpl(IMapper mapper,DataConverter dataConverter){
        this.mapper = mapper;
        this.dataConverter = dataConverter;
    }

    @Override
    public void attach(@NotNull E aggregate) {

    }

    @Override
    public void detach(@NotNull E aggregate) {

    }

    @Override
    public E find(@NotNull ID id) {
        T dao = (T) mapper.selectById(id);
        return (E) dataConverter.toEntity(dao);
    }

    @Override
    public void remove(@NotNull E aggregate) {

    }

    @Override
    public void save(@NotNull E aggregate) {

    }
}
