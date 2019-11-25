package com.springcloud.provider.service;

import com.springcloud.provider.bean.School;
import com.springcloud.provider.dao.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolDao dao;

    public List<School> getListSchool(List<School> list){
        List<School> listSchool = dao.getListSchool(list);
        return listSchool;
    }
}
