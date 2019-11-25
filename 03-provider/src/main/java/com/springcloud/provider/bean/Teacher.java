package com.springcloud.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class Teacher {
    @ApiModelProperty(value = "老师ID",required = true)
    private Long teacherId;
    @ApiModelProperty(value = "教师编号",required = true)
    private Integer teacherWorkNo;
    @ApiModelProperty(value = "教师姓名",required = true)
    private String teacherName;
    @ApiModelProperty(value = "教师年纪",required = true)
    private String teacherAge;
    @ApiModelProperty(value = "工作年限",required = true)
    private Date workDate;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherWorkNo() {
        return teacherWorkNo;
    }

    public void setTeacherWorkNo(Integer teacherWorkNo) {
        this.teacherWorkNo = teacherWorkNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(String teacherAge) {
        this.teacherAge = teacherAge;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
