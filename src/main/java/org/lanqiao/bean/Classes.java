package org.lanqiao.bean;

import java.util.List;

/**
 * Created by andy on 2017/9/4.
 */
public class Classes {
    private Integer classId;//班级编号
    private String className;//班级名称
    private Teacher teacher;//老师
    private List<Student> students;//学生集合

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
