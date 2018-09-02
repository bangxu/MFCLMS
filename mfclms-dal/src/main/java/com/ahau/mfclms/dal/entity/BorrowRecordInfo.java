package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.Column;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  0:30 2018/9/2
 */
public class BorrowRecordInfo  extends BaseDataEntity {

    @Column(name = "book_id",nullable = false)
    private long bookId;

    @Column(name="student_id",nullable = false)
    private long studentId;

    @Column(name = "operator_id" ,nullable = false)
    private String operatorId;//操作人员姓名

    @Column(name = "operate_type")
    private String operateType;//操作类型

}
