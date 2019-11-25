package com.springcloud.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel
public class School {

    @ApiModelProperty(value = "学校ID",required = true)
    private Long schoolId;
    @ApiModelProperty(value = "学校名称",required = true)
    private String schoolName;
    @ApiModelProperty(value = "学校地址",required = true)
    private String address;
    // 建校日期
    @ApiModelProperty(value = "学校建校日期",required = true)
    private String establishSchoolDate;
    // 占地面积
    @ApiModelProperty(value = "学校占地面积",required = true)
    private String floorSpace;
    @ApiModelProperty(value = "学校学生",required = true)
    private List<Student> students;
    @ApiModelProperty(value = "学校老师",required = true)
    private List<Teacher> teachers;
    @ApiModelProperty(value = "学校班级",required = true)
    private List<Classes> classes;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEstablishSchoolDate() {
        return establishSchoolDate;
    }

    public void setEstablishSchoolDate(String establishSchoolDate) {
        this.establishSchoolDate = establishSchoolDate;
    }

    public String getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(String floorSpace) {
        this.floorSpace = floorSpace;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }
}
