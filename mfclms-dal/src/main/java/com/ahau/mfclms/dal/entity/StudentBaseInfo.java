package com.ahau.mfclms.dal.entity;

import com.ahau.mfclms.dal.entity.baseentity.BaseDataEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author By Barry
 * @Description: ${todo}
 * @date create in  22:29 2018/9/1
 */
@Entity
@Table(name="mfclms_student_base_info")
public class StudentBaseInfo extends BaseDataEntity {

    @Column(name="student_name",nullable = false)
    private String studentName;

    @Column(name="age",nullable = false)
    private int age;

    @Column(name="college_name")
    private String collegeName;//学院

    @Column(name="college_id")
    private String collegeId;//学院ID

    @Column(name="department_name")
    private String departmentName;//院系

    @Column(name="department_id")
    private String departmentId;//院系ID

    @Column(name="school_year")
    private String schoolYear;//入学年份

    @Column(name="active",nullable = false)
    private int active = 1;//当前学生状态(0代表无效，1有效)

    @Column(name="already_borrow_books",nullable = false)
    private int alreadyBorrowBooks = 0;//已经借的书

    @Column(name = "level_id")
    private String levelId;//当钱学生所属的等级，等级不同所能借的书也不同


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getAlreadyBorrowBooks() {
        return alreadyBorrowBooks;
    }

    public void setAlreadyBorrowBooks(int alreadyBorrowBooks) {
        this.alreadyBorrowBooks = alreadyBorrowBooks;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
}
