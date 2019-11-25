package com.springcloud.provider.controller;

import com.springcloud.provider.bean.School;
import com.springcloud.provider.config.ResponseEntity;
import com.springcloud.provider.service.SchoolService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService service;

    @ApiOperation(value="查询学校信息")
    @RequestMapping(value="/getListSchool" ,method = RequestMethod.GET)
    public List<School> getListSchool(){
        List<School> list = new ArrayList<>();
        List<School> listSchool = service.getListSchool(list);
        return listSchool;
    }
    @ApiOperation(value="查询学校信息")
    @RequestMapping(value="/getEntitySchool/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<List<School>> getEntitySchool(
            @PathVariable("id") Long id
    ){
        List<School> list = new ArrayList<>();
        List<School> listSchool = service.getListSchool(list);
        ResponseEntity<List<School>> entity = new ResponseEntity<>();
        entity.setData(listSchool);
        return entity;
    }
    @ApiOperation(value="查询学校信息")
    @RequestMapping(value="/getEntitySchool" ,method = RequestMethod.POST)
    public ResponseEntity<List<School>> getEntitySchoolByPost(
            @RequestBody() School school
    ){
        List<School> list = new ArrayList<>();
        List<School> listSchool = service.getListSchool(list);
        ResponseEntity<List<School>> entity = new ResponseEntity<>();
        entity.setData(listSchool);
        return entity;
    }

    @ApiOperation(value="查询学校信息")
    @RequestMapping(value="/getMapSchool" ,method = RequestMethod.POST)
    public ResponseEntity<List<Map<String,String>>> getMapSchool(
            @RequestBody() School school
    ){
        List<School> list = new ArrayList<>();
        List<School> listSchool = service.getListSchool(list);
        ResponseEntity<List<Map<String,String>>> entity = new ResponseEntity<>();
        List<Map<String,String>> list1 = new ArrayList<>();
        for (School ss: listSchool) {
            HashMap hashMap = new HashMap(BeanMap.create(ss));
            list1.add(hashMap);
        }
        entity.setData(list1);
        return entity;
    }
    /*@ApiOperation(value="查询学校信息")
    @RequestMapping(value="/getEntitySchool" ,method = RequestMethod.GET)
    public org.springframework.http.ResponseEntity<List<School>> getEntitySchool(){
        List<School> list = new ArrayList<>();
        List<School> listSchool = service.getListSchool(list);
        org.springframework.http.ResponseEntity<List<School>> entity = new org.springframework.http.ResponseEntity<>(listSchool, HttpStatus.OK);
        return entity;
    }*/
}
