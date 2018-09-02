package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.*;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  22:35 2018/9/1
 */
@Entity
@Table(name="mfclms_level_info")
public class LevelInfo extends BaseDataEntity {

    @Column(name = "allow_books")
    private int allowBooks;//允许借的书数目

    public int getAllowBooks() {
        return allowBooks;
    }

    public void setAllowBooks(int allowBooks) {
        this.allowBooks = allowBooks;
    }
}
