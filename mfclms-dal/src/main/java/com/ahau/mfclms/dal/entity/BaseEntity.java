package com.ahau.mfclms.dal.entity;

import java.io.Serializable;

/**
 * @author By Barry
 * @Description: Entity 基础类
 * @date create in  23:32 2018/7/13
 */
public class BaseEntity implements Serializable {

    private String dataCreateData;

    private String dataModifyData;

    private Long id;

    private Long version;

    public String getDataCreateData() {
        return dataCreateData;
    }

    public void setDataCreateData(String dataCreateData) {
        this.dataCreateData = dataCreateData;
    }

    public String getDataModifyData() {
        return dataModifyData;
    }

    public void setDataModifyData(String dataModifyData) {
        this.dataModifyData = dataModifyData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
