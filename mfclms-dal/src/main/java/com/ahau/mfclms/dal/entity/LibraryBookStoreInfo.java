package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  22:37 2018/9/1
 */
@Entity
@Table(name="mfclms_library_book_store_info")
public class LibraryBookStoreInfo extends BaseDataEntity {

    @Column(name = "book_id",nullable = false)
    private long bookId;

    @Column(name = "book_count")
    private int bookCount;//该种类书的总量

    @Column(name = "borrow_books")
    private int borrowBooks;//已经借出书的总量

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(int borrowBooks) {
        this.borrowBooks = borrowBooks;
    }
}
