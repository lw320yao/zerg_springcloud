package com.springcloud.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class Student {
    @ApiModelProperty(value = "学生ID",required = true)
    private Long studentId;
    @ApiModelProperty(value = "学生编号",required = true)
    private Integer studentNo;
    @ApiModelProperty(value = "学生姓名",required = true)
    private String studentName;
    @ApiModelProperty(value = "学生年纪",required = true)
    private Integer studentAge;
    @ApiModelProperty(value = "学生出生日期",required = true)
    private Date bornDate;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
}
