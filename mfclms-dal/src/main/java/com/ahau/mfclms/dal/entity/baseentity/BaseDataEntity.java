package com.ahau.mfclms.dal.entity.baseentity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author By Barry
 * @Description: Entity 基础类
 * @date create in  23:32 2018/7/13
 */
@MappedSuperclass
public class BaseDataEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="dataCreate_date",nullable = false,columnDefinition = "timestamp default current_timestamp")
    private String dataCreateDate;

    @Column(name="dataModify_date",nullable = false,columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private String dataModifyDate;

    @Version
    @Column(name="version",nullable = false)
    private Long version;

    public String getDataCreateDate() {
        return dataCreateDate;
    }

    public void setDataCreateDate(String dataCreateDate) {
        this.dataCreateDate = dataCreateDate;
    }

    public String getDataModifyDate() {
        return dataModifyDate;
    }

    public void setDataModifyDate(String dataModifyDate) {
        this.dataModifyDate = dataModifyDate;
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
