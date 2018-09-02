package com.ahau.mfclms.server.service.base;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  23:26 2018/9/1
 */
public interface BaseService<T extends BaseDataEntity> {

    void add(T t);

    void delete(long id);

    T update(T t);

    T query(T t);

}
