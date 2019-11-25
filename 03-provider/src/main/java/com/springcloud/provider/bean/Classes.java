package com.springcloud.provider.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class Classes {

    @ApiModelProperty(value = "班级ID",required = true)
    private Long classesId;
    @ApiModelProperty(value = "班级编号",required = true)
    private Integer classesNo;
    @ApiModelProperty(value = "班级名称",required = true)
    private String className;
    @ApiModelProperty(value = "创建日期",required = true)
    private Date createDate;
    @ApiModelProperty(value = "班级属性",required = true)
    private String repository;

    public Long getClassesId() {
        return classesId;
    }

    public void setClassesId(Long classesId) {
        this.classesId = classesId;
    }

    public Integer getClassesNo() {
        return classesNo;
    }

    public void setClassesNo(Integer classesNo) {
        this.classesNo = classesNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }
}
