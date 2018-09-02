package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  11:54 2018/9/2
 */
@Entity
@Table(name="mfclms_operator_base_info")
public class OperatorBaseInfo extends BaseDataEntity {

    @Column(name = "operator_name",nullable = false)
    private String operatorName;

    @Column(name="operator_post",nullable = false)
    private String operatorPost;//操作人员职位

    @Column(name = "active",nullable = false)
    private int active = 1;//当前状态(0代表无效，1有效)

}
