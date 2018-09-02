package com.ahau.mfclms.server.service.base;

import com.ahau.mfclms.dal.dao.basedao.BaseDataEntityDAO;
import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  23:28 2018/9/1
 */
public class BaseServiceImpl<T extends BaseDataEntity,D extends BaseDataEntityDAO<T,Long>> implements BaseService<T> {

    D entityDAO;

    public BaseServiceImpl(D entityDAO){
        this.entityDAO = entityDAO;
    }

    public void add(T t){

        this.entityDAO.save(t);

    }

    public void delete(long id){

        this.entityDAO.deleteById(id);

    }

    public T update(T t){
        return this.entityDAO.save(t);
    }

    public T query(T t){
        return this.entityDAO.findById(t.getId()).get();
    }


}
