package org.lanqiao.bean;

import java.sql.Date;

/**
 * Created by andy on 2017/9/4.
 */
public class Student {
    private Integer studentId;//学生ID
    private String studentName;//学生名字
    private Integer stuedntAge;//学生年龄
    private String studentSex;//学生性别
    private Date studentBirth;//学生的生日

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStuedntAge() {
        return stuedntAge;
    }

    public void setStuedntAge(Integer stuedntAge) {
        this.stuedntAge = stuedntAge;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public Date getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(Date studentBirth) {
        this.studentBirth = studentBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", stuedntAge=" + stuedntAge +
                ", studentSex='" + studentSex + '\'' +
                ", studentBirth=" + studentBirth +
                '}';
    }
}
