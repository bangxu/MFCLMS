package com.ahau.mfclms.dal.dao.basedao;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  23:34 2018/7/13
 */
public interface BaseDataEntityDAO<T extends BaseDataEntity,ID extends Serializable> extends JpaRepository<T, ID> {
}
