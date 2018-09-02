package com.ahau.mfclms.server.service.impl;

import com.ahau.mfclms.dal.dao.StudentBaseInfoDAO;
import com.ahau.mfclms.dal.entity.StudentBaseInfo;
import com.ahau.mfclms.server.service.StudentInfoService;
import com.ahau.mfclms.server.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  23:43 2018/9/1
 */
@Service
public class StudentInfoServiceImpl extends BaseServiceImpl<StudentBaseInfo, StudentBaseInfoDAO> implements StudentInfoService {

    @Autowired
    public StudentInfoServiceImpl(StudentBaseInfoDAO studentInfoDAO){
        super(studentInfoDAO);
    }

}
