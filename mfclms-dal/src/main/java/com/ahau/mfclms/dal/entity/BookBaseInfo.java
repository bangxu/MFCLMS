package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.*;

/**
 * @author By Barry
 * @Description: 用于记录某种类书籍的状态
 * @date create in  23:30 2018/7/13
 */
@Entity
@Table(name="mfclms_book_base_info")
public class BookBaseInfo extends BaseDataEntity {

    @Column(name = "book_name",nullable = false)
    private String bookName;

    @Column(name="book_price")
    private String bookPrice;

    @Column(name="publishing_house")
    private String publishingHouse;//出版社

    @Column(name="publishing_dateTime",columnDefinition = "timestamp")
    private String publishingDateTime;//出版时间

    @Column(name="classification",nullable = false)
    private String classification;//书籍所属分类

    @Column(name="local",nullable = false)
    private String local;//书籍所在图书馆位置

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
