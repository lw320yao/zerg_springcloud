package com.springcloud.provider.dao;

import com.springcloud.provider.bean.Classes;
import com.springcloud.provider.bean.School;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SchoolDao {

    public List<School> getListSchool(List<School> list){
        List<School> returnList = new ArrayList<>();
        School school = new School();
        Classes classes = new Classes();
        classes.setClassesId(12312L);
        classes.setClassesNo(231231);
        classes.setClassName("一年级A班");
        classes.setCreateDate(new Date());
        classes.setRepository("班主任");
        List<Classes> classesList = new ArrayList<>();
        classesList.add(classes);
        school.setAddress("民治大道民治中学");
        school.setClasses(classesList);
        returnList.add(school);
        return returnList;
    }

}
